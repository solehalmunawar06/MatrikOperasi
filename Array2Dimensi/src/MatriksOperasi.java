import java.util.Scanner;

public class MatriksOperasi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pilih operasi dulu
        System.out.println("Pilih Operasi");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        // Input ukuran matriks
        System.out.print("\nMasukkan jumlah baris: ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        // Membuat array
        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        double[][] hasil = new double[baris][kolom];

        // Input matriks A
        System.out.println("\nInput Matriks A");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {

                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();

            }
        }

        // Input matriks B
        System.out.println("\nInput Matriks B");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {

                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();

            }
        }

        // Proses operasi
        switch (pilihan) {

            case 1:
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {

                        hasil[i][j] = A[i][j] + B[i][j];

                    }
                }

                System.out.println("\nHasil Penjumlahan");
                break;

            case 2:
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {

                        hasil[i][j] = A[i][j] - B[i][j];

                    }
                }

                System.out.println("\nHasil Pengurangan");
                break;

            case 3:
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {

                        hasil[i][j] = A[i][j] * B[i][j];

                    }
                }

                System.out.println("\nHasil Perkalian");
                break;

            case 4:
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {

                        if (B[i][j] != 0) {
                            hasil[i][j] = (double) A[i][j] / B[i][j];
                        } else {
                            System.out.println("Tidak bisa dibagi 0");
                        }

                    }
                }

                System.out.println("\nHasil Pembagian");
                break;

            default:
                System.out.println("Pilihan tidak valid");
                return;
        }

        // Menampilkan hasil
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {

                System.out.print(hasil[i][j] + "\t");

            }

            System.out.println();
        }

        input.close();
    }
}