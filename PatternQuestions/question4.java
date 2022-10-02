package patterns;
import java.util.*;;
public class question4 {
    public static void main(String[] args) {
        Scanner S1=new Scanner(System.in);
        int n, i, j;
        System.out.print("Enter Limit: ");
        n = S1.nextInt();
        for (i=1;i<=n;i++) {
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}