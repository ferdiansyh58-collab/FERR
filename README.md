# Laporan Proyek Aplikasi Perpustakaan Mini  
(Berbasis Java Console dan Pemrograman Berorientasi Objek)

---

## **BAB I – PENDAHULUAN**

### 1.1 Latar Belakang
Perpustakaan merupakan tempat pengelolaan dan peminjaman buku yang membutuhkan pencatatan data yang terstruktur. Proses pengelolaan secara manual memiliki risiko kesalahan pencatatan dan sulit dalam pencarian data.  
Oleh karena itu, dibuatlah **Aplikasi Perpustakaan Mini Berbasis Console** untuk memodelkan proses pengelolaan buku dan anggota menggunakan konsep **Pemrograman Berorientasi Objek (PBO/OOP)**.

### 1.2 Tujuan Proyek
Tujuan dari proyek ini adalah:
- Menerapkan konsep **class dan object**
- Memahami penggunaan **constructor**
- Mengimplementasikan **enkapsulasi (private, getter, setter)**
- Menggunakan **ArrayList** untuk menyimpan kumpulan objek
- Mengimplementasikan **method dengan parameter dan return value**

---

## **BAB II – PERANCANGAN (DESIGN)**

### 2.1 Identifikasi Objek Utama

| Class   | Peran |
|--------|--------|
| Book    | Menyimpan data buku |
| Member  | Menyimpan data anggota |
| Library | Mengelola data buku dan anggota |

### 2.2 Hubungan Antar Class (Deskripsi Diagram)

Library **memiliki banyak** Book dan Member (relasi _has-a_):

Library
├── ArrayList<Book>
└── ArrayList<Member>


### 2.3 Atribut dan Method

#### Class Book
**Atribut:**
- `id` : String → ID buku  
- `judul` : String → Judul buku  
- `penulis` : String → Nama penulis  
- `dipinjam` : boolean → Status peminjaman  

**Method:**
- `tampilkanInfo()`
- `pinjamBuku()`
- `kembalikanBuku()`

#### Class Library
**Atribut:**
- `daftarBuku` : ArrayList\<Book>

**Method:**
- `tambahBuku()`
- `cariBuku()`
- `tampilkanSemuaBuku()`

---

## **BAB III – IMPLEMENTASI**

### 3.1 Penjelasan Class Utama

#### Class Book

Cuplikan kode:
```java
private String id;
private String judul;
private String penulis;
private boolean dipinjam;

Penjelasan:

Atribut dibuat private untuk menerapkan enkapsulasi

Akses dilakukan melalui getter dan setter

Constructor & Overloading

public Book() { }

public Book(String id, String judul, String penulis) {
    this.id = id;
    this.judul = judul;
    this.penulis = penulis;
}

Class Book memiliki constructor overloading.

Method dengan Parameter & Return
public Book cariBukuById(String id) {
    return buku;
}

Method ini menerima parameter dan mengembalikan objek.

3.2 Penggunaan Getter & Setter
public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

Digunakan untuk mengakses data yang bersifat private.

3.3 Penggunaan ArrayList
private ArrayList<Book> daftarBuku = new ArrayList<>();

Operasi yang digunakan:
Menambah: add()
Menampilkan: loop for-each
Mencari: perulangan + kondisi if

3.4 Alur Program Utama (Main)
Program menampilkan menu
User memilih menu
Sistem membaca input menggunakan Scanner
Program memanggil method sesuai pilihan
Program kembali ke menu utama

Alur sederhana:

Mulai → Tampilkan Menu → Input User → Proses → Kembali ke Menu → Selesai

BAB IV – PENGUJIAN
4.1 Skenario Pengujian
| No | Skenario                    | Hasil                     |
| -- | --------------------------- | ------------------------- |
| 1  | Menambah buku baru          | Buku berhasil ditambahkan |
| 2  | Mencari buku berdasarkan ID | Data buku ditemukan       |
| 3  | Input menu tidak valid      | Pesan error ditampilkan   |

4.2 Contoh Output Console

Skenario Tambah Buku:

ID Buku : B001
Judul   : The Last Earth
Penulis : Tere Liye
Buku berhasil ditambahkan

Skenario Menu Salah:
 Menu tidak tersedia

BAB V – KESIMPULAN
5.1 Kesimpulan

Dari proyek ini dapat disimpulkan bahwa konsep Pemrograman Berorientasi Objek (PBO) sangat membantu dalam menyusun program dengan struktur yang rapi.
Beberapa konsep yang berhasil diterapkan:

Class & Object

Enkapsulasi

Constructor & Constructor Overloading

Method dengan parameter dan return

Penggunaan ArrayList

5.2 Keterbatasan dan Pengembangan

Keterbatasan aplikasi:
Belum menggunakan database
Data hanya tersimpan saat program berjalan

Rencana pengembangan:
Menambahkan database seperti MySQL
Menambahkan fitur login user
Membuat versi berbasis GUI atau Web

## 👤 Developer

- **Nama** : Ferdi Ardiansyah  
- **NIM**  : (1003250050)  
- **Kelas**: (Pemrograman Berorientasi Objek )
