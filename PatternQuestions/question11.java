package patterns;
import java.util.*;
public class question11 {
    public static void main(String[] args) {
        Scanner S1=new Scanner(System.in);
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        S1.close();
    }
}
