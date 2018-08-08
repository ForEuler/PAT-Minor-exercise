package YiJi;

import java.util.Scanner;


public class no1036 {
	 public static void main(String[] args) 
	 {
		 Scanner in=new Scanner(System.in);
		 int N=in.nextInt();
		 String c=in.next();
		 in.close();
		 int row=(int)(N/(float)2+0.5)-2;
		 String pattern1="";
		 for(int i=0;i<N;i++)
			 pattern1+=c;
		 System.out.println(pattern1);
		 String pattern2=c;
		 for(int i=0;i<N-2;i++)
			 pattern2+=" ";
		 pattern2+=c;
		 for(int i=0;i<row;i++)
		 {
			 System.out.println(pattern2);
		 }
		 System.out.println(pattern1);		 
	 }
}
