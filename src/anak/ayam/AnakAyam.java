/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anak.ayam;

import java.util.Scanner;

/**
 *
 * @author LABKOM01-RPL27
 */
public class AnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer jml ;
        System.out.print("Masukan Jumlah Anak Ayam :");
        jml = sc.nextInt();
        
        for(int i = 1;jml >=i;jml--)
        {
            System.out.print("Anak Ayam Ada "+jml);
            if(jml==1)
            {
                System.out.println(" Mati 1 Tinggal Kenangan");
            }
            else{
                System.out.println(" Mati 1 Tinggal "+(jml-1));
            }
        }
        
        // TODO code application logic here
    }
    
}
