package gov.in.oupp.training.java.corejava.questions.nov22;
/*
* Check whether a string is a palindrome or not*/
public class CheckPalindrome {
    public static boolean palindromeCheck(String str){
        boolean flag=true;
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
            }
            i++;
            j--;
        }
        return flag;
    }

    public static void main(String[] args) {
        String str="madam";
        if(palindromeCheck(str)){
            System.out.println(str+" is a palindrome");
        }
        else
            System.out.println(str+" is not a palindrome");
    }
}
