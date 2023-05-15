/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancerizky;

/**
 *
 * @author Rizky Fatkhur R
 */
public class Koleksi {
    protected String judul;
    protected String penerbit;
    protected int tahun;
    
    public Koleksi(String judul, String penerbit, int tahun) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    
    public String getJudul() {
        return this.judul;
    }
    
    public String getPenerbit() {
        return this.penerbit;
    }
    public int getTahun() {
        return this.tahun;
    }
}
