/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung.luas;
import java.util.Scanner;

/**
 *
 * @author fujitsu
 */
public class HitungLuas {

    /**
     * @param args the command line arguments
     */
     public static void luasPersegiPanjang() {
        int panjang;
        int lebar;
        int luas;
        Scanner masukkan = new Scanner(System.in);

        System.out.print("Masukan panjang : ");
        panjang = masukkan.nextInt();

        System.out.print("Masukan Lebar   : ");
        lebar = masukkan.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas persegi panjang adalah: " + luas);
        System.out.println("");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
