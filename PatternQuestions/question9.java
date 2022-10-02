package patterns;
import java.util.*;;
public class question9 {
    public static void main(String[] args) {
        Scanner S1=new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter Limit: ");
        n=S1.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0)
                System.out.print(1);
                else
                System.out.print(0);
            }
            System.out.println();
        }
    }
}