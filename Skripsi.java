/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancerizky;

/**
 *
 * @author Rizky Fatkhur R
 */
public class Skripsi extends Buku{
    private String NPM;
    
    public Skripsi(String NPM, String penulis, String judul, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun);
        this.NPM = NPM;
    }
    
    public String getNPM() {
        return this.NPM;
    }
}
