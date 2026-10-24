import java.util.Scanner;

public class TiketBioskop19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga_tiket = 50000, total_tiket = 0, jumlah_tiket;
        double diskon, total_harga, total_penjualan;
        
        while (true) {
            System.out.print("Masukkan jumlah tiket (input 0 untuk batal): ");
            jumlah_tiket = sc.nextInt();

            if (jumlah_tiket == 0) {
                break;
            }

            if (jumlah_tiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silahkan melakukan input ulang.");
                continue;
            }

            if (jumlah_tiket > 10) {
                diskon = 0.15;
            } else if (jumlah_tiket > 4) {
                diskon = 0.1;
            } else {
                diskon = 0;
            }

            total_harga = jumlah_tiket * harga_tiket;
            total_harga = total_harga - (total_harga * diskon);

            total_tiket += jumlah_tiket;
            total_penjualan =+ total_harga;

            System.out.println("Tiket dibeli        : " + jumlah_tiket);
            System.out.println("Diskon              : " + (diskon * 100) + "%");
            System.out.println("Total Harga         : " + total_harga);
            System.out.println("Total tiket terjual : " + total_tiket);
            System.out.println("Total penjualan     : " + total_penjualan);
        }

        sc.close();
    }
}
