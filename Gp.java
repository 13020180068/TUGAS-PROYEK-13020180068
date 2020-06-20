/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class Gp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            String nama;
            int jum, gol, jkerja, jlembur, gapok, glembur, tun_pengabdian, upah;
            double pajakgapok, pajaklembur, totpajak,gajibersih;

            System.out.println("PROGRAM MENGHITUNG GAJI KARYAWAN");
            System.out.println("-------------------------------------------------");

            System.out.print("Masukan Nama : ");
            nama=input.next();
            System.out.print("Masukan Golongan : ");
            gol=input.nextInt();
            System.out.print("Masukan Jam Kerja : ");
            jkerja=input.nextInt();

            switch(gol){
                case 1 : 
                        gapok=500000;
                        tun_pengabdian=5000;
                        break;
                case 2 :
                        gapok=300000;
                tun_pengabdian=3000;
                        break;
                case 3 :
                        gapok=250000;
                tun_pengabdian=2000;
                        break;
                case 4 :
                        gapok=100000;
                tun_pengabdian=1500;
                        break;
                case 5 :
                        gapok=50000;
                tun_pengabdian=1000;
                    break;
                default :
                    gapok=0;
                    tun_pengabdian=0;
            }

            if (jkerja>173){
                jlembur=jkerja-173;	
            }else{
                 jlembur=0;
            }
            

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);

            
            pajakgapok=0.05*gapok;
            gajibersih=((gapok+tun_pengabdian)-pajakgapok);

            System.out.println("Nama                 : "+nama);
            System.out.println("Gaji Pokok           : "+ kursIndonesia.format(gapok));
            System.out.println("Pajak Gaji Pokok     : "+kursIndonesia.format(pajakgapok));
            System.out.println("Tunjangan Pengabdian : "+kursIndonesia.format(tun_pengabdian));
            System.out.println("Gaji Diterima        : "+kursIndonesia.format(gajibersih));
  }  
}
    
    


