import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama siswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai akhir: ");
        double nilai = input.nextDouble();

        System.out.println("\n=== HASIL KELULUSAN ===");
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);

        // Menentukan kelulusan
        if (nilai >= 60) {
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }

        // Menentukan kategori nilai
        if (nilai >= 90) {
            System.out.println("Predikat: A (Sangat Baik)");
        } else if (nilai >= 80) {
            System.out.println("Predikat: B (Baik)");
        } else if (nilai >= 70) {
            System.out.println("Predikat: C (Cukup)");
        } else if (nilai >= 60) {
            System.out.println("Predikat: D (Kurang)");
        } else {
            System.out.println("Predikat: E (Gagal)");
        }

        input.close();
    }
}
