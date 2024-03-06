public class TransaksiBarang25 {
    // Atribut
    private Barang25 barang;
    private int jumlah;

    // Constructor
    public TransaksiBarang25(Barang25 barang, int jumlah) {
        this.barang = barang;
        this.jumlah = jumlah;
    }

    // Method untuk menampilkan informasi transaksi
    public void tampilkanInfoTransaksi() {
        System.out.println("Transaksi:");
        barang.tampilkanInfo();
        System.out.println("Jumlah: " + jumlah);
    }

    // Method main untuk contoh penggunaan
    public static void main(String[] args) {
        // Membuat objek barang
        Barang25 barang1 = new Barang25("B001", "Laptop", 8000000, 10);

        // Membuat transaksi barang
        TransaksiBarang25 transaksi1 = new TransaksiBarang25(barang1, 3);
        transaksi1.tampilkanInfoTransaksi();
    }
}
