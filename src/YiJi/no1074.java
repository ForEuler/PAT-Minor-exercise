package YiJi;

import java.util.Scanner;
import java.util.Stack;

public class no1074 {
	public static void main(String[] args)  
	  {
		 Scanner in = new Scanner(System.in);
		 String table=in.nextLine();
		 String a=in.nextLine();
		 String b=in.nextLine();
		 in.close();
		 int ltable=table.length();
		 int la=a.length();
		 int lb=b.length();
		 Stack<Integer> res=new Stack<Integer>();
		 //a b处理为等长
		 int len=la>lb?la:lb;
		 String s="";
		 for(int i=0;i<len-la;i++)
			 s+="0";
		 a=s+a;
		 for(int i=0;i<len-lb;i++)
			 s+="0";
		 b=s+b;
		 
		 int i=ltable-1;
		 int j=len-1;
		 int t=0;
		 while(j>=0)
		 {
			 int aNum=a.charAt(j)-'0';
			 int bNum=b.charAt(j)-'0';
			 int tableNum=table.charAt(i)-'0';
			 if(tableNum==0)
				 tableNum=10;
			 int sum=aNum+bNum+t;
			 int r=sum%tableNum;
			 res.add(r);
			 t=sum/tableNum;
			 i--;
			 j--;
		 }
		 if(t!=0)
		 res.add(1);
		  while(res.isEmpty()==false&&res.peek()==0)
			  res.pop();
		  if(res.isEmpty()==true)
			  System.out.print(0);
		  else
			  {
			  while (res.isEmpty()==false) 
			  System.out.print(res.pop());	
			  }
	  }
}
