import java.io.*;
import java.util.*;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        mazePaths(1, 1, n, m, "");
    }

    public static void mazePaths(int sr, int sc, int er, int ec, String ans) {
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(ans);
            return;
        }
        mazePaths(sr, sc + 1, er, ec, ans + 'h');
        mazePaths(sr + 1, sc, er, ec, ans + 'v');
    }
}



// import java.io.*;
// import java.util.*;

// public class PrintMazePath {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int m = scn.nextInt();
//         System.out.println(mazePaths(1, 1, n, m, ""));
//     }

//     public static int mazePaths(int sr, int sc, int er, int ec, String ans) {
//         if (sr > er || sc > ec) {
//             return 1;
//         }
//         if (sr == er && sc == ec) {
//             System.out.println(ans);
//             return 1;
//         }
//         int count = 0;
//         count += mazePaths(sr, sc + 1, er, ec, ans + 'h');
//         count += mazePaths(sr + 1, sc, er, ec, ans + 'v');

//         return count;
//     }
// }



// WITH DIAGONAL INCLUDED IN IT.. RAJNEESH WAYYY
// import java.io.*;
// import java.util.*;

// public class PrintMazePath {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int m = scn.nextInt();
//         System.out.println(mazePaths(0, 0, n, m, ""));
//     }

//     public static int mazePaths(int sr, int sc, int er, int ec, String ans) {
//         if (sr == er && sc == ec) {
//             System.out.println(ans);
//             return 1;
//         }
//         int count = 0;
//         if(sc+1<=ec)
//             count += mazePaths(sr, sc+1, er, ec, ans+'h');
//         if(sc+1<=ec && sr+1<=er)
//             count += mazePaths(sr+1, sc+1, er, ec, ans+'d');
//         if(sr+1<=er)
//             count += mazePaths(sr+1, sc, er, ec, ans+'v');        

//         return count;
//     }
// }