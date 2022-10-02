package patterns;
import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner S1=new Scanner(System.in);
        int n, i, j;
        System.out.print("Enter Limit: ");
        n = S1.nextInt();
        for (i=1;i<=n;i++) {
            for(j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
