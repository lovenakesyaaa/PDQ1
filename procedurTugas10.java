import java.util.Scanner;
public class procedurTugas10 {
  public static void tampilkanMahasiswa(String nama, String nim, double ipk) {
    System.out.println("================================");
    System.out.println("Data Mahasiswa");
    System.out.println("================================");
    System.out.println("Nama : " + nama);
    System.out.println("NIM : " + nim);
    System.out.println("IPK : " + ipk);
    System.out.println("================================");
    System.out.println(" ");

    }

    public static void cetakTabel(int angka) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka  + " x " + i + " = " + (angka * i));
        }
    }
  
  public static void main(String[] args) {
    String nama;
    String nim;
    double ipk;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Nama : ");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM : ");
    nim = sc.nextLine();
    System.out.print("Masukkan IPK : ");
    ipk = sc.nextDouble();
    tampilkanMahasiswa(nama, nim, ipk);
    
    int angka;
    System.out.print("Masukkan angka untuk tabel perkalian : ");
    angka = sc.nextInt();
    cetakTabel(angka);
    }
  }


    

