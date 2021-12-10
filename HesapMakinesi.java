import java.util.Scanner;

public class HesapMakinesi {
    static int toplama(int a, int b){
        int toplam = a+b;

        return toplam;
    }
    static int cikarma(int a,int b){
        int cikan = a-b;

        return cikan;
    }
    static int bölme(int a, int b){
        int bölüm = a/b;
        System.out.println("Kalan: " + a%b );
        return bölüm;
    }
    static int carpma(int a, int b){
        int carpim = a*b;

        return carpim;
    }
    static int usslu(int alt, int ust){
        int us = 1;
        for(int scan=1;scan <= ust;scan++ ) {
            us*=alt;
        }
    return us;
    }
    // n!=n.n-1.n-2
    static int faktoriyel(int a){
        int b=1;
        for(int scan = 1;scan<=a;scan++){
            b*=scan;
        }
        return b;
    }
    static void mod(int a,int b){
        int modu = a%b;

        System.out.println(modu);
    }
    static void alanCevre(int a,int b){
        int cevre = 2*(a+b);
        int alan = a*b;
        System.out.println("üçgen çevresi:" + cevre + "\nüçgen alanı: " + alan);
    }




    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);
        int select;

        String menu = "1-Toplama\n" + "2-Çıkarma\n" + "3-Bölme\n" + "4-Çarpma\n" + "5-Üsslü sayı hesaplama\n" + "6-Faktoriyel\n"
               + "7-Mod alma\n" + "8-Dikdörtgen alan ve çevre hesabı\n" + "0-Çıkış\n";

        do {
            System.out.println(menu);
            System.out.println("Seçimini yap!");
            select = keyboard.nextInt();
            System.out.println("Seçimin " + select +" numaralı işlem.");

            switch (select) {
                case 1:
                    System.out.println("Sonuç: " + (toplama(keyboard.nextInt(), keyboard.nextInt())));
                    break;
                case 2:
                    System.out.println("Sonuç: " + (cikarma(keyboard.nextInt(), keyboard.nextInt())));
                    break;
                case 3:
                    System.out.println("Sonuç: " + (bölme(keyboard.nextInt(), keyboard.nextInt())));
                    break;
                case 4:
                    System.out.println("Sonuç: " + (carpma(keyboard.nextInt(), keyboard.nextInt())));
                    break;
                case 5:
                    System.out.println("Sonuç: " + (usslu(keyboard.nextInt(), keyboard.nextInt())));
                    break;
                case 6:
                    System.out.println("Sonuç: " + (faktoriyel(keyboard.nextInt())));
                    break;
                case 7:
                    mod(keyboard.nextInt(),keyboard.nextInt());
                    break;
                case 8:
                    alanCevre(keyboard.nextInt(),keyboard.nextInt());
                    break;




            }
        }
        while (select != 0);
        }
    }

