import java.util.Scanner;

public class MainBarang25 {
    public static void main(String[] args) {
        // Menambahkan data barang
        Barang25 barang1 = new Barang25("B001", "Laptop", 8000000, 10);
        Barang25 barang2 = new Barang25("B002", "Smartphone", 5000000, 15);
        Barang25 barang3 = new Barang25("B003", "Tablet", 3000000, 20);
        Barang25 barang4 = new Barang25("B004", "Mouse", 50000, 30);
        Barang25 barang5 = new Barang25("B005", "Keyboard", 200000, 25);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan daftar barang");
            System.out.println("2. Beli barang");
            System.out.println("3. Tampilkan pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tampilkanDaftarBarang(barang1, barang2, barang3, barang4, barang5);
                    break;
                case 2:
                    beliBarang(barang1, barang2, barang3, barang4, barang5);
                    break;
                case 3:
                    // Implementasi tampilkan pembelian
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih kembali.");
            }
        } while (choice != 4);
    }

    public static void tampilkanDaftarBarang(Barang25... barang) {
        System.out.println("Daftar Barang Tersedia:");
        System.out.println("Kode\tNama\tHarga\tStok");
        for (Barang25 brg : barang) {
            System.out.println(brg.getKode() + "\t" + brg.getNama() + "\t" + brg.getHarga() + "\t" + brg.getStok());
        }
    }

    public static void beliBarang(Barang25... barang) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kode barang yang ingin dibeli: ");
        String kodeBarang = scanner.next();

        Barang25 barangDibeli = null;
        for (Barang25 brg : barang) {
            if (brg.getKode().equals(kodeBarang)) {
                barangDibeli = brg;
                break;
            }
        }

        if (barangDibeli != null) {
            barangDibeli.tampilkanInfo();
            System.out.println("Apakah Anda ingin berbelanja lagi? (1: Ya, 0: Tidak)");
            int lagi = scanner.nextInt();
            if (lagi != 1) {
                System.out.println("Terima kasih!");
                System.exit(0);
            }
        } else {
            System.out.println("Kode barang tidak valid.");
        }
    }
}
