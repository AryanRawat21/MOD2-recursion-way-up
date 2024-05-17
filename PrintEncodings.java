import java.io.*;
import java.util.*;

public class PrintEncodings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        getEncoding(str, "");
    }

    public static void getEncoding(String ques, String ans) {
        if (ques.length() == 0) {       //for 0
            System.out.println(ans);
            return;
        } else if (ques.length() == 1) {    //if length = 1
            char ch = ques.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int charvalue = ch - '0';
                char code = (char) ('a' + charvalue - 1);
                System.out.println(ans + code);
            }
        } else {        //if length = 2 or more
            char ch = ques.charAt(0);
            String roq = ques.substring(1);
            if (ch == '0') {
                return;
            } else {
                int charvalue = ch - '0';
                char code = (char) ('a' + charvalue - 1);
                getEncoding(roq, ans + code);
            }
            String ch12 = ques.substring(0, 2);
            String roq12 = ques.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if (ch12v <= 26) {
                char code = (char) ('a' + ch12v - 1);
                getEncoding(roq12, ans + code);
            }

        }
    }
}

// import java.io.*;
// import java.util.*;

// public class PrintEncodings {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         String str = scn.next();
//         System.out.println(getEncoding(str, ""));

//     }

//     public static int getEncoding(String str, String ans) {
//         if (str.length() == 0) {
//             System.out.println(ans);
//             return 1;
//         }
//         int count = 0;
//         char ch = str.charAt(0);
//         if (ch == '0')
//             return 0;

//         count += getEncoding(str.substring(1), ans + (char) ('a' + ch - '1'));
//         if (str.length() > 1) {
//             int num = (ch - '0') * 10 + (str.charAt(1) - '0');
//             if (num <= 26)
//                 count += getEncoding(str.substring(2), ans + (char) ('a' + num - 1));
//         }
//         return count;
//     }
// }

