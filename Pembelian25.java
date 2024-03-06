import java.util.Scanner;

public class Pembelian25 {
    // Atribut
    private Barang25[] daftarBarang;

    // Constructor
    public Pembelian25(int jumlahBarang) {
        daftarBarang = new Barang25[jumlahBarang];
    }

    // Method untuk menampilkan daftar barang yang tersedia
    public void tampilkanBarang() {
        System.out.println("Daftar Barang Tersedia:");
        for (int i = 0; i < daftarBarang.length; i++) {
            if (daftarBarang[i] != null) {
                System.out.println((i + 1) + ". " + daftarBarang[i].getNama() + " - Harga: " + daftarBarang[i].getHarga());
            }
        }
    }

    // Method untuk menampilkan daftar barang yang dibeli
    public void tampilkanBarangPembelian() {
        System.out.println("Barang yang Dibeli:");
        for (Barang25 barang : daftarBarang) {
            if (barang != null) {
                barang.tampilkanInfo();
            }
        }
    }

    // Method untuk melakukan pembelian
    public void pembelian(int nomorBarang, int jumlah) {
        if (nomorBarang <= daftarBarang.length && nomorBarang > 0) {
            Barang25 barangDibeli = daftarBarang[nomorBarang - 1];
            if (barangDibeli != null) {
                double totalHarga = barangDibeli.getHarga() * jumlah;
                if (barangDibeli.kurangiStok(jumlah)) {
                    System.out.println("Pembelian berhasil!");
                    System.out.println("Total Harga: " + totalHarga);
                } else {
                    System.out.println("Pembelian gagal. Stok tidak mencukupi.");
                }
            } else {
                System.out.println("Barang dengan nomor tersebut tidak tersedia.");
            }
        } else {
            System.out.println("Nomor barang tidak valid.");
        }
    }

    // Method untuk menambahkan barang ke dalam daftar barang
    public void tambahBarang(Barang25 barang, int index) {
        if (index < daftarBarang.length && index >= 0) {
            daftarBarang[index] = barang;
        } else {
            System.out.println("Index tidak valid.");
        }
    }
    
    // Method untuk membeli barang
    public void beliBarang(Scanner scanner) {
        System.out.println("Masukkan nomor barang yang ingin dibeli:");
        int nomorBarang = scanner.nextInt();
        System.out.println("Masukkan jumlah barang yang ingin dibeli:");
        int jumlah = scanner.nextInt();
        pembelian(nomorBarang, jumlah);
    }

    // Method main untuk contoh penggunaan
    public static void main(String[] args) {
        // Membuat objek pembelian dengan maksimal 5 barang
        Pembelian25 pembelian = new Pembelian25(5);

        // Menambahkan barang-barang ke dalam daftar barang
        pembelian.tambahBarang(new Barang25("B001", "Laptop", 8000000, 10), 0);
        pembelian.tambahBarang(new Barang25("B002", "Smartphone", 5000000, 15), 1);
        pembelian.tambahBarang(new Barang25("B003", "Tablet", 3000000, 20), 2);

        // Menampilkan daftar barang yang tersedia
        pembelian.tampilkanBarang();

        // Melakukan pembelian
        Scanner scanner = new Scanner(System.in);
        pembelian.beliBarang(scanner);

        // Menampilkan daftar barang yang dibeli
        pembelian.tampilkanBarangPembelian();
    }
}
