package interviewQuestions8;

import java.util.ArrayList;

public class Q02_2D_CollectionsTask {
    // Create 2D ArrayList which can store String ArrayLists
// Create 3 ArrayLists which are Employees, Employers, Companies
// Store this 3 ArrayList in 2D ArrayList

// String ArrayList'leri depolayabilen 2D ArrayList oluşturun
// Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
// Bu 3 ArrayList'i 2D ArrayList'te saklayın
public static void main(String[] args) {
    ArrayList<ArrayList<String>>listeler=new ArrayList<>();//2d arrylist
    ArrayList<String>calisanlar=new ArrayList<>();
    calisanlar.add("Ajmet");
    calisanlar.add("Ali");
    calisanlar.add("Emrah");
    calisanlar.add("Elif");
    calisanlar.add("technical support");


    ArrayList<String>isverenler=new ArrayList<>();
    isverenler.add("Haluk");
    isverenler.add("Eylül");
    isverenler.add("Yusuf");
    isverenler.add("Can");
    isverenler.add("Ibrahim");
    isverenler.add("Mehmet");

    ArrayList<String>sirketler=new ArrayList<>();
    sirketler.add("Amazon");
    sirketler.add("Google");
    sirketler.add("Testinium");
    sirketler.add("Ibm");
listeler.add(calisanlar);
listeler.add(isverenler);
listeler.add(sirketler);

    System.out.println(listeler);



}

}
