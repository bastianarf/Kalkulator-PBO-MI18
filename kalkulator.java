/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;
import java.util.Scanner;
import java.lang.Math;
interface standart {
    public void tambah();
    public void kurang();
    public void kali();
    public void bagi();
}

interface scientific {
    public void sin();
    public void cos();
    public void tan();
}

abstract class programmer {
    public abstract void bintodec();
    public abstract void dectobin();
    public abstract void hextodec();
    public abstract void dectohex();
    public abstract void octtodec();
    public abstract void dectooct();
}

class kalku extends programmer {
    Scanner kalko = new Scanner(System.in);
    @Override
    public void bintodec(){
        String binarystring = null;
        System.out.println("Masukkan angka binary : ");
        binarystring = kalko.nextLine();
        int bintodec;
        bintodec = Integer.parseInt(binarystring,2);
        System.out.println("Hasilnya adalah : " + bintodec);
    }

    @Override
    public void dectobin() {
        System.out.println("Masukkan angka desimal : ");
        int dectobin;
        dectobin = kalko.nextInt();
        System.out.println("Hasilnya adalah : " +Integer.toString(dectobin));
        
    }

    @Override
    public void hextodec() {
        String hexstring = null;
        System.out.println("Masukkan angka hexadecimal : ");
        hexstring = kalko.nextLine();
        int hextodec;
        hextodec = Integer.parseInt(hexstring, 16);
        System.out.println("Hasilnya adalah : " + hextodec);
    }

    @Override
    public void dectohex() {
        System.out.println("Masukkan angka desimal : ");
        int dectohex;
        dectohex = kalko.nextInt();
        System.out.println("Hasilnya adalah : " +Integer.toHexString(dectohex));
    }

    @Override
    public void octtodec() {
        String octalstring = null;
        System.out.println("Masukkan angka oktal : ");
        octalstring = kalko.nextLine();
        int octtodec;
        octtodec = Integer.parseInt(octalstring, 8);
        System.out.println("Hasilnya adalah : " +octtodec);
    }

    @Override
    public void dectooct() {
        int decttooct;
        System.out.println("Masukkan angka desimal : ");
        decttooct = kalko.nextInt();
        System.out.println("Hasilnya adalah : " +Integer.toOctalString(decttooct));
    }
}
class kalke implements standart, scientific {
    Scanner kalki = new Scanner(System.in);
    @Override
    public void tambah() {
        System.out.println("Masukkan angka pertama : ");
        int tambah1;
        tambah1 = kalki.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int tambah2;
        tambah2 = kalki.nextInt();
        int angka;
        angka = tambah1 + tambah2;
        System.out.println("Hasilnya adalah : " +angka);
    }

    @Override
    public void kurang() {
        System.out.println("Masukkan angka pertama : ");
        int kurang1;
        kurang1 = kalki.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int kurang2;
        kurang2 = kalki.nextInt();
        int angka;
        angka = kurang1 - kurang2;
        System.out.println("Hasilnya adalah : " +angka);
    }

    @Override
    public void kali() {
        System.out.println("Masukkan angka pertama : ");
        int kali1;
        kali1 = kalki.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int kali2;
        kali2 = kalki.nextInt();
        int angka;
        angka = kali1 * kali2;
        System.out.println("Hasilnya adalah : " +angka);
    }

    @Override
    public void bagi() {
        System.out.println("Masukkan angka pertama : ");
        int bagi1;
        bagi1 = kalki.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int bagi2;
        bagi2 = kalki.nextInt();
        int angka;
        angka = bagi1 / bagi2;
        System.out.println("Hasilnya adalah : " +angka);
    }
    
    @Override
    public void sin() {
        System.out.println("Masukkan angka : ");
        double sin1;
        sin1 = kalki.nextDouble();
        double angka;
        angka = Math.toRadians(sin1);
        double sinfinal;
        sinfinal = Math.sin(angka);
        System.out.println("Nilai sin " + sin1 + " adalah : " + sinfinal);
    }

    @Override
    public void cos() {
        System.out.println("Masukkan angka : ");
        double cos1;
        cos1 = kalki.nextDouble();
        double angka;
        angka = Math.toRadians(cos1);
        double cosfinal;
        cosfinal = Math.cos(angka);
        System.out.println("Nilai cos " + cos1 + " adalah : " + cosfinal);
    }

    @Override
    public void tan() {
        System.out.println("Masukkan angka : ");
        double tan1;
        tan1 = kalki.nextDouble();
        double angka;
        angka = Math.toRadians(tan1);
        double tanfinal;
        tanfinal = Math.tan(angka);
        System.out.println("Nilai tan "+ tan1 + " adalah : " + tanfinal);
    }
}
public class kalkulator {    
    public static void main(String[] args) {
        Scanner pilihan = new Scanner(System.in);
        kalke kalka = new kalke();
        kalku kalk = new kalku();
        System.out.println("=============================");
        System.out.println("==== PROGRAM KALKULATOR =====");
        System.out.println("=== OLEH BASTIAN ARFIANTO ===");
        System.out.println("===  NIM : 18050623002    ===");
        System.out.println("= D3 MANAJEMEN INFORMATIKA ==");
        System.out.println(" ===== U N E S A ============");
        System.out.println("=============================");
        System.out.println("1. Kalkulator Standart ");
        System.out.println("2. Kalkulator Scientific ");
        System.out.println("3. Kalkulator Programmer ");
        System.out.println("Masukkan pilihan : ");
        int pilih;
        pilih = pilihan.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("=============================");
                System.out.println("=== KALKULATOR STANDARD =====");
                System.out.println("=== OLEH BASTIAN ARFIANTO ===");
                System.out.println("===  NIM : 18050623002    ===");
                System.out.println("= D3 MANAJEMEN INFORMATIKA ==");
                System.out.println(" ===== U N E S A ============");
                System.out.println("=============================");
                System.out.println("1. Penambahan ");
                System.out.println("2. Pengurangan ");
                System.out.println("3. Perkalian ");
                System.out.println("4. Pembagian ");
                System.out.println("Masukkan pilihan : ");
                int pilih1;
                pilih1 = pilihan.nextInt();
                switch (pilih1) {
                    case 1:
                        kalka.tambah();
                        break;
                    case 2:
                        kalka.kurang();
                        break;
                    case 3:
                        kalka.kali();
                        break;
                    case 4:
                        kalka.bagi();
                        break;
                }
                break;
            case 2:
                System.out.println("=============================");
                System.out.println("=== KALKULATOR SCIENTIFIC ===");
                System.out.println("=== OLEH BASTIAN ARFIANTO ===");
                System.out.println("===  NIM : 18050623002    ===");
                System.out.println("= D3 MANAJEMEN INFORMATIKA ==");
                System.out.println(" ===== U N E S A ============");
                System.out.println("=============================");
                System.out.println("1. Sin ");
                System.out.println("2. Cos ");
                System.out.println("3. Tan ");
                System.out.println("Masukkan pilihan : ");
                int pilih2;
                pilih2 = pilihan.nextInt();
                switch (pilih2) {
                    case 1:
                        kalka.sin();
                        break;
                    case 2:
                        kalka.cos();
                        break;
                    case 3:
                        kalka.tan();
                }
            case 3:
                System.out.println("=============================");
                System.out.println("=== KALKULATOR PROGRAMMER ===");
                System.out.println("=== OLEH BASTIAN ARFIANTO ===");
                System.out.println("===  NIM : 18050623002    ===");
                System.out.println("= D3 MANAJEMEN INFORMATIKA ==");
                System.out.println(" ===== U N E S A ============");
                System.out.println("=============================");
                System.out.println("1. Binary ke Desimal ");
                System.out.println("2. Desimal ke Binary ");
                System.out.println("3. Hexadesimal ke Desimal ");
                System.out.println("4. Desimal ke Hexadesimal ");
                System.out.println("5. Oktal ke Desimal ");
                System.out.println("6. Desimal ke Oktal ");
                System.out.println("Masukkan pilihan : ");
                int pilih3;
                pilih3 = pilihan.nextInt();
                switch(pilih3) {
                    case 1:
                        kalk.bintodec();
                        break;
                    case 2:
                        kalk.dectobin();
                        break;
                    case 3:
                        kalk.hextodec();
                        break;
                    case 4:
                        kalk.dectohex();
                        break;
                    case 5:
                        kalk.octtodec();
                        break;
                    case 6:
                        kalk.dectooct();
                        break;
                }
    }
}
}
