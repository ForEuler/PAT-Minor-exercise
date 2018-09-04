package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no1083 {
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		int[] count=new int[N];
		for (int i=0;i<N;i++)
			count[i]=0;
		String[] temp=in.readLine().split(" ");
		for (int i=0;i<N;i++)
		{
			int num=Integer.parseInt(temp[i]);
			int sub=num>i+1?num-(i+1):(i+1)-num;
			count[sub]++;
		}
		for (int i=N-1;i>=0;i--)
			if(count[i]>=2)
			System.out.println(i+" "+count[i]);		
		
	}
}
