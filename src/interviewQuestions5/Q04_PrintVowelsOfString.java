package interviewQuestions5;

import java.util.Scanner;

public class Q04_PrintVowelsOfString {
    //Get String from user and print just vowels(aeiou) inside String on the console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scanner.nextLine().toLowerCase();//soruda kucuk harf istemis o yuzden toLowerCase yaptik
        System.out.println("1.yol ile while loop");
        int index=0;
        while (index<str.length()){
            char c=str.charAt(index);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.print(c);
            }
            index++;
        }
        System.out.println();
        System.out.println("2.yol ile cozum");
        //2.yol

        String s=str.replaceAll("[^aeiou]",""); //
        // []: icerisindeki butun karakterlere islem yapar
        // ^ : yanindaki karakterlerin disindakileri alir
        System.out.println(s);

    }
}