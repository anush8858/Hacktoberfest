package patterns;
import java.util.*;
public class question10 {
    public static void main(String[] args) {
        Scanner S1=new Scanner(System.in);
        int i,j,k;
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(k=1;k<=2*(4-j+1);k++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=4;i++){
            for(j=4;j>=i;j--)
            {
                System.out.print("*");
            }
            for(k=1;k<=2*(i-1);k++){
                System.out.print(" ");
            }
            for(j=4;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        S1.close();
    }
}
