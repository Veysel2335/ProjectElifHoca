package practice_basic_day03;

import java.util.Scanner;

public class Q05_MethodCreation05 {
    /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("47 den kucuk pozitif bir sayi giriniz");
        int sayi=scan.nextInt();
        fibonacci(sayi);//method olustur


    }
public static void fibonacci(int num){
        int sayi1=0;
        int sayi2=1;
        int sayi3; //belli degil method getirsin oyle bir sey yazalim ki
    System.out.print( sayi1+"-");
    System.out.print( sayi2+"-");
    if (num<47){
        for (int i = 2; i <num ; i++) { //0 ve 1 tanimli
            sayi3=sayi1+sayi2;
            System.out.print("-" +sayi3);
            sayi1=sayi2;
            sayi2=sayi3;
        }

    }else System.out.println("47 den kuuck bir sayi giriniz...");
}

}
