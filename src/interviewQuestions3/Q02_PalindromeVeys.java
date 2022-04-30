package interviewQuestions3;

public class Q02_PalindromeVeys {
    public static void main(String[] args) {
        String s="123321";
        String reversedS="";

        for (int i = s.length()-1; i >-1 ; i--) {
            reversedS=reversedS+s.charAt(i);


        }
        System.out.println(reversedS);
        if (s.equals(reversedS)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
