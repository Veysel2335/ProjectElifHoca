package interviweQuestion6;

import java.util.Locale;
import java.util.Scanner;

public class Q02_AtbashCode {
       /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */
       public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
           System.out.println("sifrenilecek ifadeyi girin");
           String ifade= scan.nextLine().toLowerCase();
           for (int i = 0; i <ifade.length() ; i++) {
               int index='z'-ifade.charAt(i);//tersten bakacagi icin sondan cikardik
               System.out.print((char)(('a')+index));

           }
           System.out.println();
           String str1=  "abcdefghijklmnopqrstuvwxyz";
           String str2= "zyxwvutsrqponmlkjihgfedcba";
           System.out.println("sifrenilecek ifadeyi girin");
           String str3=scan.nextLine().toLowerCase();
           for (int i = 0; i <str3.length() ; i++) {
               for (int j = 0; j <26 ; j++) {
                   if (str3.charAt(i)==str1.charAt(j)){//kullanicidan aldigimiz str3 de ki herhangi
                       // bir karakter str1bir karaktere esit ise ayni indexte str2 de ki karsiligini yazdir
                       System.out.print(str2.charAt(i));
                   }

               }

           }

       }
}
