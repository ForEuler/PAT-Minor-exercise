package YiJi;

import java.util.Scanner;

public class no1056 {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	int N=in.nextInt();
	int sum=0;
	for(int i=0;i<N;i++)
	{
		int num=in.nextInt();
		sum+=11*num*(N-1);
	}
	in.close();
	System.out.print(sum);
}
}