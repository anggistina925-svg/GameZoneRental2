package gamezonerental;

import java.util.Scanner;

public class GameZoneRental {

    static Scanner input = new Scanner(System.in);

    public static void cetakStruk(
            String nama, String konsol, int durasi,
            int biayaSewa, int diskon,
            int biayaMinuman, int totalBayar) {

        System.out.println("\n====================================");
        System.out.println("           STRUK GAMEZONE");
        System.out.println("====================================");
        System.out.println("Pelanggan       : " + nama);
        System.out.println("Konsol          : " + konsol);
        System.out.println("Durasi          : " + durasi + " jam");
        System.out.println("Biaya Sewa      : Rp" + biayaSewa);
        System.out.println("Diskon (10%)    : Rp" + diskon);
        System.out.println("Minuman         : Rp" + biayaMinuman);
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR     : Rp" + totalBayar);
        System.out.println("====================================");
    }

    public static void main(String[] args) {

        String transaksi;

        do {
            System.out.println("\n====================================");
            System.out.println("          GAMEZONE RENTAL PS");
            System.out.println("====================================");

            System.out.print("Nama Pelanggan : ");
            String nama = input.nextLine();

            System.out.println("1. PlayStation 4 - Rp8000/jam");
            System.out.println("2. PlayStation 5 - Rp12000/jam");
            System.out.print("Pilihan         : ");
            int pilihan = input.nextInt();

            String konsol;
            int harga;

            if (pilihan == 1) {
                konsol = "PlayStation 4";
                harga = 8000;
            } else {
                konsol = "PlayStation 5";
                harga = 12000;
            }

            System.out.print("Lama Bermain (jam): ");
            int durasi = input.nextInt();

            int biayaSewa = harga * durasi;
            int diskon = 0;

            if (durasi >= 3) {
                diskon = biayaSewa * 10 / 100;
            }

            System.out.print("Tambah Minuman (Y/T): ");
            char minuman = input.next().charAt(0);

            int biayaMinuman = 0;
            if (minuman == 'Y' || minuman == 'y') {
                biayaMinuman = 5000;
            }

            int totalBayar = biayaSewa - diskon + biayaMinuman;

            cetakStruk(nama, konsol, durasi,
                    biayaSewa, diskon, biayaMinuman, totalBayar);

            input.nextLine();
            System.out.print("\nTransaksi Baru (Y/T): ");
            transaksi = input.nextLine();

        } while (transaksi.equalsIgnoreCase("Y"));

        System.out.println("Terima kasih!");
        input.close();
    }
}
