public class Barang25 {
    // Atribut
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Barang25(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Method untuk menampilkan informasi barang
    public void tampilkanInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }

    // Method untuk menambah stok barang
    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    // Method untuk mengurangi stok barang
    public boolean kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            return true;
        } else {
            System.out.println("Stok tidak mencukupi.");
            return false;
        }
    }

    // Method untuk mendapatkan kode barang
    public String getKode() {
        return kode;
    }

    // Method untuk mendapatkan nama barang
    public String getNama() {
        return nama;
    }

    // Method untuk mendapatkan harga barang
    public double getHarga() {
        return harga;
    }

    // Method untuk mendapatkan stok barang
    public int getStok() {
        return stok;
    }

    // Method main untuk contoh penggunaan
    public static void main(String[] args) {
        // Data barang
        Barang25 barang1 = new Barang25("B001", "Laptop", 8000000, 10);
        Barang25 barang2 = new Barang25("B002", "Smartphone", 5000000, 15);
        Barang25 barang3 = new Barang25("B003", "Tablet", 3000000, 20);
        Barang25 barang4 = new Barang25("B004", "Mouse", 50000, 30);
        Barang25 barang5 = new Barang25("B005", "Keyboard", 200000, 25);

        // Menampilkan informasi barang
        barang1.tampilkanInfo();
        barang2.tampilkanInfo();
        barang3.tampilkanInfo();
        barang4.tampilkanInfo();
        barang5.tampilkanInfo();
    }
}
