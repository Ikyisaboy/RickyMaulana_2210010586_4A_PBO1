package uaspbo1;

import java.util.Scanner;

public class PegawaiBeraksi {

    public static void main(String[] args) {
        // Error handling
        try {
            // IO sederhana
            Scanner scanner = new Scanner(System.in);

            // Array
            PegawaiDetail[] pegawai = new PegawaiDetail[2];

            // Perulangan biasa
            for (int i = 0; i < pegawai.length; i++) {
                System.out.print("Masukkan Nama Pegawai " + (i + 1) + ": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIP Pegawai " + (i + 1) + ": ");
                String nip = scanner.nextLine();

                // Objek
                pegawai[i] = new PegawaiDetail(nama, nip);
            }

            // Perulangan array
            for (PegawaiDetail data : pegawai) {
                System.out.println("====================");
                System.out.println("Data Pegawai: ");
                System.out.println(data.displayInfo());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format NIP: "  + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
}
}
}