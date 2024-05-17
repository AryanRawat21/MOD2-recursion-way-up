import java.io.*;
import java.util.*;

public class PrintPermutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        getPermutation(str, "");
    }

    public static void getPermutation(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0, i);   //question left part
            String qrpart = ques.substring(i + 1);  //question right part
            String roq = qlpart + qrpart;
            getPermutation(roq, ans + ch);
        }
    }
}



// IF WE HAVE TO COUNT THE NUMBER OF PERMUTATIONS

// import java.io.*;
// import java.util.*;

// public class PrintPermutations {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         String str = scn.next();
//         System.out.println(getPermutation(str, ""));
//     }

//     public static int getPermutation(String ques, String ans) {
//         if (ques.length() == 0) {
//             System.out.println(ans);
//             return 1;
//         }
//          int count = 0;
//         for (int i = 0; i < ques.length(); i++) {
//             char ch = ques.charAt(i);
//             String qlpart = ques.substring(0, i);
//             String qrpart = ques.substring(i + 1);
//             String roq = qlpart + qrpart;
//            count += getPermutation(roq, ans + ch);
//         }
//         return count;
//     }
// }