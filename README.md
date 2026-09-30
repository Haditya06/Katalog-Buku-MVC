# 📚 Katalog Buku MVC

Aplikasi desktop untuk manajemen katalog buku perpustakaan yang dibangun menggunakan pola **Model-View-Controller (MVC)** dengan Java Swing.

## 🎯 Deskripsi

**Katalog Buku MVC** adalah aplikasi GUI yang memudahkan pengguna untuk:
- ➕ Menambahkan buku baru ke dalam katalog
- 📖 Melihat daftar semua buku yang tersimpan
- 🗑️ Menghapus buku tertentu dari katalog
- 🔄 Membersihkan semua data dengan sekali klik

Aplikasi ini menggunakan arsitektur **MVC** untuk memisahkan logika bisnis (Model), tampilan (View), dan pengendalian (Controller) secara jelas dan terstruktur.

## 🏗️ Arsitektur Proyek

```
KatalogBukuMVC/
├── src/
│   └── katalogbukumvc/
│       ├── Main.java                 # Entry point aplikasi
│       ├── model/
│       │   ├── Buku.java            # Model data buku
│       │   └── BukuModel.java       # Model untuk manajemen koleksi buku
│       ├── view/
│       │   └── BukuView.java        # GUI aplikasi
│       └── controller/
│           └── BukuController.java  # Penghubung model dan view
```

## 🔧 Komponen Utama

### 1. **Model** (`BukuModel.java`)
Mengelola data buku dalam memori menggunakan `ArrayList`:
- `tambahBuku(Buku)` - Menambah buku baru
- `hapusBuku(int)` - Menghapus buku berdasarkan index
- `hapusSemua()` - Menghapus semua buku
- `getSemuaBuku()` - Mengambil daftar semua buku

### 2. **View** (`BukuView.java`)
Antarmuka pengguna berbasis Swing dengan komponen:
- Input field: Judul, Penulis, Tahun Terbit
- Tombol: Simpan, Hapus, Clear
- Tabel: Menampilkan daftar buku

### 3. **Controller** (`BukuController.java`)
Menghubungkan Model dan View dengan logika:
- `simpanBuku()` - Validasi input dan menyimpan buku
- `hapusBuku()` - Menghapus buku yang dipilih
- `clearBuku()` - Membersihkan semua data

## 🚀 Cara Menjalankan

### Prasyarat
- **Java Development Kit (JDK)** 8 atau lebih baru
- IDE Java (NetBeans, IntelliJ IDEA, atau Eclipse)

### Langkah Menjalankan
1. Clone atau download repository ini
   ```bash
   git clone https://github.com/Haditya06/Katalog-Buku-MVC.git
   ```

2. Buka project di IDE favorit Anda

3. Kompilasi dan jalankan file `Main.java`:
   ```bash
   javac KatalogBukuMVC/src/katalogbukumvc/Main.java
   java katalogbukumvc.Main
   ```

   Atau gunakan menu "Run" di IDE Anda.

## 📝 Fitur Utama

| Fitur | Deskripsi |
|-------|-----------|
| **Tambah Buku** | Input judul, penulis, dan tahun terbit, kemudian klik "Simpan" |
| **Validasi Input** | Semua field harus diisi dan tahun terbit harus berupa angka |
| **Lihat Daftar** | Tabel otomatis menampilkan semua buku yang tersimpan |
| **Hapus Buku** | Pilih buku di tabel, klik "Hapus" untuk menghapusnya |
| **Clear Semua** | Tombol "Clear" menghapus semua data sekaligus |

## 💡 Contoh Penggunaan

1. **Menambah Buku:**
   - Masukkan: Judul = "Belajar Java", Penulis = "John Doe", Tahun = "2023"
   - Klik tombol "Simpan"
   - Buku akan muncul di tabel

2. **Menghapus Buku:**
   - Klik baris buku di tabel
   - Klik tombol "Hapus"
   - Buku terpilih akan dihapus dari daftar

## 🎨 User Interface

Aplikasi menggunakan **Nimbus Look and Feel** untuk tampilan modern dan konsisten di berbagai platform. Interface dirancang simple namun user-friendly dengan:
- Layout yang rapi dan terorganisir
- Tombol yang jelas dan mudah diakses
- Tabel yang menampilkan data dengan formatnya yang tepat

## 🔍 Validasi Data

Aplikasi memiliki validasi input yang ketat:
- ✓ Semua field (Judul, Penulis, Tahun Terbit) wajib diisi
- ✓ Tahun Terbit harus berupa angka (integer)
- ✓ Pesan error yang jelas jika input tidak valid

## 📚 Teknologi yang Digunakan

- **Bahasa:** Java
- **GUI Framework:** Java Swing
- **Arsitektur:** Model-View-Controller (MVC)
- **Data Structure:** ArrayList

## 🎓 Pembelajaran

Proyek ini cocok untuk mempelajari:
- Pola arsitektur MVC dalam aplikasi GUI
- Java Swing untuk membuat antarmuka desktop
- Pemisahan tanggung jawab (Separation of Concerns)
- Event handling dalam GUI
- Validasi input dan error handling

## 👤 Author

**Haditya06** - Created for educational purposes

## 📄 Lisensi

Proyek ini bebas digunakan untuk keperluan pembelajaran. Silakan modifikasi sesuai kebutuhan.

## 🤝 Kontribusi

Kontribusi dan saran perbaikan sangat diterima! Silakan buat issue atau pull request.

---

**Catatan:** Data buku disimpan dalam memori, sehingga akan hilang ketika aplikasi ditutup. Untuk penyimpanan permanen, Anda dapat menambahkan database seperti SQLite atau MySQL.
