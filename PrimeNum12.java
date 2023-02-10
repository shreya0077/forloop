import java.util.Scanner;
class primeNum12
{
       public static void main(String args[]) {

          int n,num=0;
          System.out.println("Enter any Number");
          Scanner bs=new Scanner(System.in);
          n=bs.nextInt();

          for(int i=1;i<=n; i++)
          {
              if(n%i==0)
              {
                  num++;
              }
          }
          if(num==2)
              System.out.println("Prime Number");
          else
              System.out.println("Not Prime Number");
      
       }
}

                  