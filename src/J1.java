//JAVA program to print a pattern of right triangle using  star

import java.util.*;
public class J1 {
    public static void main(String[] args) {
        int i, j, k=5;
        for(i=1; i<=k; i++){
            for (j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}
