import java.util.*;
        public class mod_array {
    public int math(int[] a, int n,int b){
        int sum=0 ;
        int power =1;
    for(int i=0;i<n-1;i++)
            {
                sum=sum+(a[i]*power)%b;
                power=(power*10);

            }
    return sum;

}

            public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
                System.out.println("enter n value");
               int n=sc.nextInt();
                int a[]=new int[n];
                System.out.println("b value");
                int b=sc.nextInt();
                for(int i=0;i<=n-1;i++){
                    //System.out.println(i);
                    a[i]=sc.nextInt();
                    //System.out.println(a[0]+a[1]);
                }
              mod_array value=new mod_array();
                System.out.println(value.math(a,n,b));

            }}