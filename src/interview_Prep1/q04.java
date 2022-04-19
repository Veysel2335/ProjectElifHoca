package interview_Prep1;

import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {
        //STRING OLAN PIN kodunuzu kontrol eden bir kod yaziniz

        Scanner scan=new Scanner(System.in);
      String pin="said.12345";
      int girisHakki=4;
        System.out.println("****hosgeldiniz*****");
        while (true){
            System.out.println("pin kodunu  gir");
            String girilenPin= scan.nextLine();
            if (pin.equals(girilenPin)){
                System.out.println("basarili giris yaptin: ");
                break;

            }else {
                System.out.println("yanlis giris yaptin");
                girisHakki--;
                System.out.println("kalan giris hakkiniz:"+girisHakki);

            }if (girisHakki==0){
                System.out.println("giris hakkiniz kalmadi..bloke oldunuz: ");
                break;
            }

        }
    }
}
