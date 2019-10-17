/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan31.perkenalanmahasiswa;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Rizki Adam Kurniawan", "10110269");
        System.out.println("My NIM is " + mahasiswa1.getNim());
        System.out.println("My Name is " + mahasiswa1.getNama());
        System.out.println(" ");
        Mahasiswa mahasiswa2 = new Mahasiswa("Indra Tiola", "10110270");
        System.out.println("My NIM is " + mahasiswa2.getNim());
        System.out.println("My Name is " + mahasiswa2.getNama());
        System.out.println(" ");
        Mahasiswa mahasiswa3 = new Mahasiswa("Robi Tanzil Ganefi", "10110271");
        System.out.println("My NIM is " + mahasiswa3.getNim());
        System.out.println("My Name is " + mahasiswa3.getNama());
        System.out.println(" ");
        Mahasiswa mahasiswa4 = new Mahasiswa("Muhammad Nur Awaludin", "10110269");
        System.out.println("My NIM is " + mahasiswa4.getNim());
        System.out.println("My Name is " + mahasiswa4.getNama());
    }
    
}
