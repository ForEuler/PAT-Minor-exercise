package YiJi;

import java.util.Scanner;

public class no1021 {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	String str=in.next();
	int[] count=new int[10];
	for(int i=0;i<10;i++)
		count[i]=0;
	for(int i=0,length=str.length();i<length;i++)
		count[str.charAt(i)-'0']++;
	for(int i=0;i<10;i++)
	{
		if(count[i]!=0)
			System.out.printf("%d:%d\n",i,count[i]);
			
	}
	in.close();

}
}
