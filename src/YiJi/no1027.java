package YiJi;

import java.util.Scanner;


public class no1027 {
	public static void main(String[] args) 
	  {
	   Scanner in = new Scanner(System.in);
	   int num=in.nextInt();
	   char cha=in.next().charAt(0);
	   in.close();
	   int sum=1;
	   int max=1;
	   int remain=0;
	   //一行最多为max个
	   while(sum<num)
	   {
		   remain=num-sum;
		   max+=2;
		   if(remain<2*max)
		   {
			   max-=2;
			   break;
		   }
		   sum+=2*max;
	   }
	  for(int i=0;i<max/2;i++)//共有max行，先输出前一半
	  {
		 for(int j=0;j<i;j++)//输出i个空格
			 System.out.print(" ");
		 for(int j=0;j<max-2*i;j++)//输出max-2*i个符号
			 System.out.print(cha);
		 System.out.println();
	  }
	  for(int i=0;i<=max/2;i++)//输出后一半
	  {
		 for(int j=0;j<max/2-i;j++)//输出max/2-i个空格
			 System.out.print(" ");
		 for(int j=0;j<1+2*i;j++)//输出1+2*i个符号
			 System.out.print(cha);
		 System.out.println();
	  }
	   System.out.print(remain);  
	  }
}
