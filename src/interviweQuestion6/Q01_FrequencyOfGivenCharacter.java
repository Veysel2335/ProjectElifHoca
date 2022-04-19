package interviweQuestion6;

public class Q01_FrequencyOfGivenCharacter {
    	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.
   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */
        public static void main(String[] args) {
            String str="AAABBCDD";
            frekans(str);

        }

    private static void frekans(String str) {
            int sayac=0;
            String output="";
        for (int i = 0; i <str.length() ; i++) {//i kiyas edilen harf
            for (int j = 0; j <str.length()-1 ; j++) {
                if (str.substring(i,i+1).equals(str.substring(j,j+1))){
                    sayac++;
                }



            }
            if (!output.contains(str.substring(i,i+1))){//eger kiyas edilen harf output ta yok ise
                output+=str.substring(i,i+1)+sayac;


            }else sayac =0;//tekrar etmeyen harf icin 0 yazdik ki dongu basa sardiginda diger harf icin ekleme yapmasin



        }
        System.out.println("output"+output);
    }
}
