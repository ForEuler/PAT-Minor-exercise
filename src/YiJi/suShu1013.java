package YiJi;

import java.util.Scanner;


public class suShu {
	public static void main(String[] args)
	{
    Scanner in=new Scanner(System.in);
	int M=in.nextInt();
	int N=in.nextInt();
	int x=2;
	int count1=0;
	int count2=0;
	while(true)
	{
     if(isPrim(x))
      {
         count1++;
         if(count1>=M&&count1<=N)
         {
        	 count2++;
        	 if(count2%10==0)
           	 System.out.println(x);
             else if (count1!=N)
             System.out.print(x+" ");
             else 
             System.out.print(x);
         }
        if(count1>N)
        	 break;
	   }
     x++;
     }
      in.close();      	
	}
	
	public static boolean isPrim(int num)
	{
		if(num==2)
		return true;
		for(int i=2;i<=Math.sqrt(num);i++)
		 { 
			if(num%i==0)
				return false;
		}
		return true;
	
	}
}
