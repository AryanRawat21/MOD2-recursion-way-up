import java.io.*;
import java.util.*;

public class PrintStairPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        getStairPath(n, "");
    }

    public static void getStairPath(int n, String path) {
        if (n < 0) {
            return;
        }
        if (n == 0) {
            System.out.println(path);
            return;
        }
        getStairPath(n - 1, path + "1");
        getStairPath(n - 2, path + "2");
        getStairPath(n - 3, path + "3");
    }
}



 // WHEN WE NEED TO COUNT THE NUMBER OF STAIRPATH!!
// import java.io.*;
// import java.util.*;

// public class PrintStairPath {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         System.out.println(stairPath(n, ""));

//     }

//     public static int stairPath(int n, String ans) {
//         if (n == 0) {
//             System.out.println(ans);
//             return 1;
//         }

//         int count = 0;
//         for (int jump = 1; jump <= 3 && n - jump >= 0; jump++) {
//             count += stairPath(n - jump, ans + jump);
//         }
//         return count;
//     }
// }