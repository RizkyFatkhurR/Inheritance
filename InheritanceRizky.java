/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritancerizky;

/**
 *
 * @author Rizky Fatkhur R
 */
public class InheritanceRizky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INSTANSIASI CLASS INDUK - KOLEKSI");
        Koleksi kol1 = new Koleksi("A Gift For Yourself", "Gramedia", 2023);
        System.out.println("Judul           : " + kol1.getJudul());
        System.out.println("Penerbit        : " + kol1.getPenerbit());
        System.out.println("Tahun Terbit    : " + kol1.getTahun());
        System.out.println("");
        
        System.out.println("INSTANSIASI CLASS ANAK - BUKU");
        Buku buku1 = new Buku("Esps", "Socrates", "Erlangga", 2013);
        System.out.println("Judul           : " + buku1.getJudul());
        System.out.println("Penulis         : " + buku1.getPenulis());
        System.out.println("Penerbit        : " + buku1.getPenerbit());
        System.out.println("Tahun Terbit    : " + buku1.getTahun());
        System.out.println("");
        
        System.out.println("INSTANSIASI CLASS ANAK - MAJALAH");
        Majalah mag1 = new Majalah("Anak cerdas", "Majalah Anak", "Potret", 2017);
        System.out.println("Judul           : " + mag1.getJudul());
        System.out.println("Edisi           : " + mag1.getEdisi());
        System.out.println("Penerbit        : " + mag1.getPenerbit());
        System.out.println("Tahun Terbit    : " + mag1.getTahun());
        System.out.println("");
        
        System.out.println("INSTANSIASI CLASS ANAK - SKRIPSI");
        Skripsi skri1 = new Skripsi("21081010051", "Rizky Fatkhur R", "Penggunaan OOP Dalam Pembuatan Interface Aplikasi", "UPN 'Veteran' Jawa Timur", 2023);
        System.out.println("NPM             : " + skri1.getNPM());
        System.out.println("Penulis         : " + skri1.getPenulis());
        System.out.println("Judul           : " + skri1.getJudul());
        System.out.println("Penerbit        : " + skri1.getPenerbit());
        System.out.println("Tahun Terbit    : " + skri1.getTahun());
        System.out.println("");
    }
    
}
