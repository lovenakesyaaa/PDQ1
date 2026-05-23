import java.util.Scanner;

public class perttt9 {
     public static boolean isGanjil(int angka) {
        return angka % 2 != 0;
    }

    // Fungsi mencari nilai terbesar
    public static int getNilaiMax(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Masukkan jumlah angka: ");
        int jumlah = input.nextInt();

        int[] arr = new int[jumlah];

        // Input angka + cek ganjil/genap
        for (int i = 0; i < jumlah; i++) {

            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();

            if (isGanjil(arr[i])) {
                System.out.println(arr[i] + " adalah bilangan ganjil");
            } else {
                System.out.println(arr[i] + " adalah bilangan genap");
            }
        }

        // Menampilkan nilai terbesar
        System.out.println("Nilai terbesar: " + getNilaiMax(arr));

        input.close();
    }
}


