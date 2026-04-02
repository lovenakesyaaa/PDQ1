import java.util.Scanner;

public class latihanBelanja {
    public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);
         //Daftar member
        String namaMember="", alamatMember="", noHPmember=""; String jawab="";

        //untuk transaksi belanja
        String namaBarang="";
        double harga=0.0, jumlah=0.0, total=0.0, diskon=0.0, grandTotal=0.0;
        
        //ditanyakan member atau bukan
        //berikan teks input
        System.out.println("apakah ingin mendaftar member? (Y/T) ");
        jawab = myObj.nextLine();

        //cek jawaban user,jawaban Y atau T menggunakan if
        if (jawab.equalsIgnoreCase("y")) {
            System.out.println("nama anda: ");
            namaMember = myObj.nextLine();
            System.out.println("alamat anda : ");
            alamatMember = myObj.nextLine();
            System.out.println("no HP anda : ");
            noHPmember = myObj.nextLine();

            System.out.println("ingin lanjut berbelanja? (y/t)");
            jawab = myObj.nextLine();
            if (jawab.equalsIgnoreCase("y")) {
                System.out.println("nama barang : ");
                namaBarang = myObj.nextLine();
                System.out.println("harga : ");
                harga = myObj.nextDouble();
                System.out.println("jumlah beli : ");
                jumlah = myObj.nextDouble();

                System.out.println();
                
                total = harga * jumlah;

            }
    } else {
        System.out.println();
    }
    
}
