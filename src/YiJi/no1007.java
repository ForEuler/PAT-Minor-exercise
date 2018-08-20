package YiJi;

import java.util.Scanner;

public class no1007 {
	public static void main(String[] args)
	{
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int count=0;
    int current=-1;
    for(int i=2; i<=num;i++)
    	{
    	if(isPrim(i))
    	  {
    		if(i-2==current)
    			count++;
        	 current=i;
    	   }
    	}
     System.out.print(count); 	
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
