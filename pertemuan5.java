import java.util.Scanner;

public class pertemuan5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        /*
        String = namaBarang
        int = hargaBarang, jumlahBarang,jumlahItem, subTotal, totalBelanja
         */
       int hargaBarang, jumlahBarang, jumlahItem, subTotal;
       int totalBelanja = 0;
       String namaBarang;

        System.out.println("Masukkan jumlah item : ");
        jumlahItem = myObj.nextInt();

        for (int i = 1; i <= jumlahItem; i++) {
            System.out.println("Masukkan nama barang ke-" + i + " : ");
            namaBarang = myObj.next();

            System.out.println("Masukkan harga barang ke-" + i + " : ");
            hargaBarang = myObj.nextInt();

            System.out.println("Masukkan jumlah barang ke-" + i + " : ");
            jumlahBarang = myObj.nextInt();

            subTotal = hargaBarang * jumlahBarang;
            totalBelanja += subTotal;

            System.out.println("Sub total untuk " + namaBarang + " adalah: " + subTotal);

            switch (i) {
                case 1:
                    System.out.println("Anda memasukkan barang pertama adalah " + namaBarang + " dengan harga " + hargaBarang + " dan jumlah " + jumlahBarang + ".");
                    break;
                case 2:
                    System.out.println("Anda memasukkan barang kedua adalah " + namaBarang + " dengan harga " + hargaBarang + " dan jumlah " + jumlahBarang + ".");
                    break;
                case 3:
                    System.out.println("Anda memasukkan barang ketiga adalah " + namaBarang + " dengan harga " + hargaBarang + " dan jumlah " + jumlahBarang + ".");
                    break;
                default:
                    System.out.println("Anda memasukkan barang ke-" + i + " adalah " + namaBarang + " dengan harga " + hargaBarang + " dan jumlah " + jumlahBarang + ".");
            }

        }
        System.out.println("Total belanja Anda adalah: " + totalBelanja);
    }
    
}
