import java.util.Scanner;
public class utsKesya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input Jumlah Mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); 

        //Array 1 dimensi untuk menyimpan nama mahasiswa
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        double[] waktuBelajar = new double[jumlahMahasiswa];

        double totalWaktuBelajar = 0;

        //Input Data Mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc.nextLine();

            System.out.print("Masukkan waktu belajar (dalam jam) untuk " + namaMahasiswa[i] + ": ");
            waktuBelajar[i] = sc.nextDouble();
            sc.nextLine(); 

            totalWaktuBelajar += waktuBelajar[i];
        }

        //Menghitung rata-rata waktu belajar
        double rataRataWaktuBelajar = totalWaktuBelajar / jumlahMahasiswa;

        //Menampilkan hasil
        System.out.println("\n=== Hasil ===");
        System.out.println("Total waktu belajar: " + totalWaktuBelajar + " jam");
        System.out.println("Rata-rata waktu belajar: " + rataRataWaktuBelajar + " jam");

        //Menentukan kaegori waktu belajar
        if (rataRataWaktuBelajar >= 2 && rataRataWaktuBelajar <= 4) {
            System.out.println("Kategori: AKTIF");
        }else {
            System.out.println("Kategori : PERLU MOTIVASI");
        }
        sc.close();
    }
}