import java.util.Scanner;

public class VendingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        vm.tambahProduk(new Product("Aqua", 3000, 10));
        vm.tambahProduk(new Product("Teh Botol", 5000, 5));

        int menu;
        do {
            System.out.println("\n=== MENU VENDING MACHINE ===");
            System.out.println("1. Lihat Produk");
            System.out.println("2. Beli Produk");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt(); sc.nextLine();

            if (menu == 1) {
                vm.tampilkanProduk();
            } 
            else if (menu == 2) {
                System.out.print("Nama produk: ");
                String nama = sc.nextLine();
                System.out.print("Jumlah: ");
                int jumlah = sc.nextInt();

                Product p = vm.cariProduk(nama);
                if (p != null && p.getStok() >= jumlah) {
                    Transaction t = new Transaction(p, jumlah);
                    p.kurangiStok(jumlah);
                    System.out.println("Total bayar: Rp" + t.hitungTotal());
                }
            }
        } while (menu != 0);
    }
}
