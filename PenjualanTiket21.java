import java.util.Scanner;
public class PenjualanTiket21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0;
        double totalHarga = 0;
        int jumlahTiket;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            // kalau input 0, perulangan berhenti
            if (jumlahTiket == 0) {
                break;
            }

            // cek kalau input negatif
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan lagi.");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; // diskon 15%
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // diskon 10%
            }

            double totalBayar = jumlahTiket * hargaTiket;
            totalBayar = totalBayar - (totalBayar * diskon);

            totalTiket = totalTiket + jumlahTiket;
            totalHarga = totalHarga + totalBayar;

            System.out.println("Harga yang harus dibayar: Rp " + totalBayar);
            System.out.println();

        } while (true);

        System.out.println("\n--- TOTAL PENJUALAN ---");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalHarga);

        sc.close();
    }
}
