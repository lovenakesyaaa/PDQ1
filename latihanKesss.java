import java.util.Scanner;

public class latihanKesss {
    public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);
        /* 
        Total belanja : double
        Total bayar : double
        Diskon : double
        Input member : string
        isMember : boolean
         */

    System.out.println("Apakah anda member (ya/tidak): ");
    String inputMember = myObj.next();
    boolean isMember = inputMember.equalsIgnoreCase("ya");
    
    System.out.println("Masukkan nama anda : ");
    String nama = myObj.nextLine();

    System.out.println("Masukkan alamat anda : ");
    String alamat = myObj.nextLine();

    System.out.println("Masukkan no HP anda : ");
    String noHp = myObj.nextLine();
   
    System.out.println("Masukkan total belanja: ");
    double totalBelanja = myObj.nextDouble();

    double diskon;
    if (totalBelanja > 300000) {
       diskon = 0.10;
    } else if (totalBelanja > 100000) {
       diskon = 0.05; 
    } else {
       diskon = 0;
    }
    if (isMember) {
      diskon = diskon + 0.02;
    }

    double totalDiskon = totalBelanja * diskon;
    double totalBayar = totalBelanja - (totalBelanja * diskon);

    System.out.print("Harga yang harus anda bayar adalah : " +totalBayar);
            
   }
}
