import java.io.*;
import java.util.*;

public class PrintKpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        getKPC(str,"");
    }


    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
    public static void getKPC(String ques, String ans) {
       if (ques.length()==0){
           System.out.println(ans);
           return;
       }
       char ch = ques.charAt(0);
       String roq = ques.substring(1); // roq-rest of question


       String codeforch = codes[ch - '0'];
       for(int i = 0;i<codeforch.length();i++){
        char option = codeforch.charAt(i);
        getKPC(roq,ans+option);
       }
       
    }
}
