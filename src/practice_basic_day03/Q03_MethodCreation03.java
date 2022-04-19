package practice_basic_day03;

import java.util.Scanner;

public class Q03_MethodCreation03 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
    public static void main(String[] args) {


       Scanner scan=new Scanner(System.in);
        System.out.println("Saati saniyeye cevirme uygulamasina hosgeldiniz:");
        System.out.println("Lutfen cevirmek istediginiz degeri girin giriniz:");
        int girilenSayi = 0;
        int cm= girilenSayi*100*100;
        int metre=10;
        int km=10;
        System.out.println(girilenSayi+"cm="+metre+km+" cm");

    }


}