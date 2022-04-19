package interviewquestion4;

public class Q06_MultipleMethodVarargs {
    public static void main(String[] args) {
        //farkli 4 ogrencinin sirasiyla 6,4,3,5 yazili notl ortl yazd parametr meth yaz

        ortalamaBul("ali",55,60,71,82,75,69);
        ortalamaBul("ayse",55,60,75,69);
        ortalamaBul("ahmet",55,60,71);
        ortalamaBul("yusuf",55,60,71,82,75);
    }

    public static void ortalamaBul(String isim, double... notlar) {
        double toplam=0;
        for (double each:notlar

             ) {
            toplam+=each;
        }
        System.out.println(isim+"not ortalamasi:"+toplam/notlar.length);

    }
}
