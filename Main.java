import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

        boolean tambahLagi = true;
        while (tambahLagi) {
            System.out.print("Masukkan nim: ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan alamat: ");
            String alamat = scanner.nextLine();

            // Membuat objek Mahasiswa baru dan menambahkannya ke daftar
            mahasiswas.add(new Mahasiswa(nim, nama, alamat));

            System.out.print("Tambah lagi? (y/n): ");
            String pilihan = scanner.nextLine();
            if (!pilihan.equalsIgnoreCase("y")) {
                tambahLagi = false;
            }
        }

        System.out.println("==================================");
        // Menampilkan informasi Mahasiswa
        for (Mahasiswa mahasiswa : mahasiswas) {
            System.out.println(mahasiswa);
        }
    }
}
