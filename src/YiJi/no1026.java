package YiJi;

import java.util.Scanner;

public class no1026 {
	public static void main(String[] args) 
	  {
	   Scanner in = new Scanner(System.in);
	   int C1=in.nextInt();
	   int C2=in.nextInt();
	   in.close();
	   int second=(int)((C2-C1)* 1.0 / 100 + 0.5);
	   System.out.printf("%02d:%02d:%02d",second/3600,second/60%60,second%60);   
	   }
}
