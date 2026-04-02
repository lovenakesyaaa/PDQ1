import java.util.Scanner;

public class latihanPD {
    public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);
                

        /* 
        Nama Barang : String
        Harga Barang : Double
        Jumlah yang dibeli : int
        Total bayar : Double
         */
      
        System.out.println("Masukkan nama barang : ");
        String namaBarang = myObj.nextLine();
        
        System.out.println("Masukkan harga barang : ");
        int hargaBarang = myObj.nextInt();

        System.out.println("Masukkan jumlah barang : ");
        int jumlahBarang = myObj.nextInt();

        int totalBayar = hargaBarang * jumlahBarang;

        System.out.println("Total yang dibayar : " + totalBayar);
        System.out.println("Nama barang : " +namaBarang);
        System.out.println("Harga barang : " +hargaBarang);
        System.out.println("Jumlah yang dibeli : " +jumlahBarang);
        System.out.println("total bayar : " +totalBayar);

    }
}
