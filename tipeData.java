public class tipeData { //blok class
    //blok main --> psvm + tab
    public static void main(String[] args) {
        //coding


        /*universitas dinamika membutuhkan aplikasi sederhana 
        untuk mencatat biodata mahasiswa. apa saja variabe dan tipe 
        data yang diperlukan? 

        NIM --> String
        Nama --> String
        Alamat --> String
        No. HP --> String
        Jenis kelamin --> String
        Program Studi --> String
        Dosen Wali --> String
        Sisa BOP --> int


        */

        //1. Deklarasikan variabel
        String nim;
        nim = "25410100054";
        
        String nama = "Kesya Lovena";
        String alamat = "Jl. Karah Agung IV/16-18";
        String noHp = "0881026239016";
        String jenisKelamin = "Perempuan";
        String programStudi = "S1 Sistem Informasi";
        String dosenWali = "Bu Sulistiowati";
        int sisaBop = 100000;

        
        //2. Print nilai variabel --> sout + tab
        //cara 1: print tanpa teks tambahan
        System.out.println(nim);

        //cara 2": print dengan teks tambahan
        System.out.println("NIM mahasiswa adalah " +nim+ " dengan nama " + nama);

        //dengan operator escape : \n (utk enter ke baris baru saat diprint)
        System.out.println("NIM : "+nim + "\nNama : "+ nama);

        System.out.println("\nAlamat : " +alamat+ "\nNo.HP : " +noHp+ "\nJenis Kelamin : " +jenisKelamin+ "\nProgram Studi : " +programStudi+ "\nDosen Wali : " +dosenWali+ "\nSisa BOP : " +sisaBop );


    }
    
}
