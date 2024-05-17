import java.io.*;
import java.util.*;

public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str,"");
    }

    public static void printSS(String ques, String ans) {
       if (ques.length()==0){
           System.out.println(ans);
           return;
       }
       char ch = ques.charAt(0);
       String roq = ques.substring(1); // roq-rest of question
       printSS(roq,ans+ch); //true
       printSS(roq,ans+""); //false
    }
}

//   USING INT WHEN WE NEED COUNT

// import java.io.*;
// import java.util.*;

// public class PrintSubsequence {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         String str = scn.nextLine();
//         System.out.println(printSS(str, ""));
//     }

//     public static int printSS(String ques, String ans) {
//         if (ques.length() == 0) {
//             System.out.println(ans);
//             return 1;
//         }
//         char ch = ques.charAt(0);
//         String roq = ques.substring(1); //roq:-rest of question
//         int count = 0;
        
//       count +=  printSS(roq, ans + ch);
//       count +=  printSS(roq, ans + "");

//       return count;
//     }
// }