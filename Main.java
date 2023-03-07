import java.io.*;
import java.util.*;
public class Main {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı(sonuç için 0): ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Bölen 0 olamaz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç: " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int n1 = scan.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int n2 = scan.nextInt();
        int result = n1 % n2;

        System.out.println("Sonuç: " + result);
    }

    static void rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kısa kenar : ");
        int a = scan.nextInt();
        System.out.print("Uzun kenar : ");
        int b = scan.nextInt();

        System.out.println("Dikdörtgenin çevresi: " + (2 * (a + b)));
        System.out.println("Dikdörtgenin alanı: " + (a * b));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);
        System.out.print("Lütfen bir işlem seçiniz: ");
        select = scan.nextInt();

        while (select != 0){

            if (select==0){

            } else if (select==1) {
                plus();
                select=0;

            }else if (select==2) {
                minus();
                select=0;

            }else if (select==3) {
                times();
                select=0;

            }else if (select==4) {
                divided();
                select=0;

            }else if (select==5) {
                power();
                select=0;

            }else if (select==6) {
                factorial();
                select=0;

            }else if (select==7) {
                mod();
                select=0;

            }else if (select==8) {
                rectangle();
                select=0;

            }else {
                System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }
    }
}