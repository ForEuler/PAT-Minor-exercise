package YiJi;

import java.util.Scanner;
public class caiXiang1001{
  public static void main(String[] args)
  {
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    int count=0;
    while(n!=1)
    {
     if(n%2==1)
     n=3*n+1;
     n/=2;
     count++;
    }
    
    System.out.print(count);
  }
}
