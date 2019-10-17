/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan31.perkenalanmahasiswa;

/**
 *
 * @author DRAGON
 */
public class Mahasiswa {
    public String nama;
    public String nim;
    
    public Mahasiswa(String nama, String nim){
        System.out.println("Hello Everyone");
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
    
}
