import java.io.*;
import java.util.*;

public class PrintMazePathWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(1, 1, n, m, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
      
        for(int ms = 1; ms <= dc - sc; ms++){
            printMazePaths(sr, sc + ms, dr, dc, psf + "h" + ms);
        }
      
       for(int ms = 1; ms <= dr - sr; ms++){
            printMazePaths(sr  + ms, sc, dr, dc, psf + "v" + ms);
        }
          
        for(int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++){
            printMazePaths(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
        }
    }

}

// // when we need to know the number of paths
// import java.io.*;
// import java.util.*;

// public class PrintMazePathWithJumps {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int m = scn.nextInt();
//         System.out.println(mazePathWithJumps(1, 1, n, m, ""));
//     }

//     public static int mazePathWithJumps(int sr, int sc, int er, int ec, String ans) {
//         if (sr == er && sc == ec) {
//             System.out.println(ans);
//             return 1;
//         }
//         int count = 0;
//         for (int jump = 1; jump <= ec - sc; jump++) {
//             count += mazePathWithJumps(sr, sc + jump, er, ec, ans + "h" + jump);
//         }
//         for (int jump = 1; jump <= er - sr; jump++) {
//             count += mazePathWithJumps(sr + jump, sc, er, ec, ans + "v" + jump);
//         }
//         for (int jump = 1; jump <= er - sr && jump <= ec - sc; jump++) {
//             count += mazePathWithJumps(sr + jump, sc + jump, er, ec, ans + "d" + jump);
//         }
//         return count;
//     }
// }