import java.util.*;
public class divisible {
    public int mod (int a[],int n) {
        int sum = 0;int count=0;
        for (int i = 0; i < n; i++) {
           sum+=a[i];

        }
            if (sum% 3 == 0) {

                count+=1;}
            else{
                count+=0;
                }

             return count;
        }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); int n=sc.nextInt();
        int a[]=new int[n];

        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        divisible rule=new divisible();
        System.out.println(rule.mod(a,n));


    }}