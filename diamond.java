import java.util.*;


public class diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        for (int i=1; i<=n; i++)
        {  for (int j = 1; j <= i; j++)
            System.out.print("* ");
            for (int k = i*2; k <=n*2-1; k++)
                System.out.print(" ");
            for (int l = 1; l <= i; l++)
                System.out.print("* ");
            System.out.println();
        }
        /*for (int i=1; i<=n-1; i++)
        {
            for (int j = n-1; j >= i; j--)
            {
                System.out.print("* ");
            }
            for (int k = 1; k <= i*2; k++)
                System.out.print(" ");
            for (int l = n-1; l >= i; l--)
                System.out.print(" *");
            System.out.println();
        }*/
    }
 }