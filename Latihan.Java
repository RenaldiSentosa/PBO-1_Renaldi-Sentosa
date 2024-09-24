// Satu file dengan kelas Mahasiswa dan Main
public class Main {
    
    // Definisi kelas Mahasiswa
    public static class Mahasiswa {
        // Atribut kelas
        private String nama;
        private String nim;
        private String jurusan;

        // Konstruktor kelas untuk inisialisasi objek
        public Mahasiswa(String nama, String nim, String jurusan) {
            this.nama = nama;
            this.nim = nim;
            this.jurusan = jurusan;
        }

        // Metode untuk mendapatkan nama mahasiswa
        public String getNama() {
            return nama;
        }

        // Metode untuk mengubah nama mahasiswa
        public void setNama(String nama) {
            this.nama = nama;
        }

        // Metode untuk menampilkan aktivitas belajar
        public void belajar() {
            System.out.println(nama + " sedang belajar.");
        }
    }

    // Metode utama (main) untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Renaldi", "060605", "Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Junaedi", "060705", "Sistem Informasi");

        // Menggunakan metode objek
        mahasiswa1.belajar();  // Output: Budi sedang belajar.
        mahasiswa2.belajar();  // Output: Ani sedang belajar.
    }
}
