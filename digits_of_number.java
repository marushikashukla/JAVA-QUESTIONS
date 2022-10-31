import java.util.Scanner;

public class digits_of_number 
{
    public static void main(String[] args)
    {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
    
      int no = 0;
      int temp =n;
      while(temp !=0){
        temp = temp /10;
        no++;

      }
      int div=(int)Math.pow(10 , no -1);
      while(n!=0)
      {
        int q=n/div;
        System.out.println(q);

        n=n%div;
        div=div/10;
      }
    }
}
