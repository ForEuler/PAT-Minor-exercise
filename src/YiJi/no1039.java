package YiJi;

import java.util.Scanner;

public class no1039 {
	public static void main(String[] args) 
	 {
		 Scanner in=new Scanner(System.in);
		 String a=in.nextLine();
		 String b=in.nextLine();
		 in.close();
		 char[] aa=a.toCharArray();
		 char[] bb=b.toCharArray();
		 int count=0;
		 for(int i=0;i<bb.length;i++)
		 {
			 for(int j=0;j<aa.length;j++)
			 {
				if(bb[i]==aa[j])
					{
					     count++;
					     aa[j]='*';
					     break;
					}
			 }
		 }
		 if(count==bb.length)
			System.out.print("Yes "+(aa.length-bb.length));
		 else
			 System.out.print("No "+(b.length()-count));
	 }
}
