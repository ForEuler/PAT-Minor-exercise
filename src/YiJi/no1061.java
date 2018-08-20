package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1061 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] temp1=in.readLine().split(" ");
		int stuNum=Integer.parseInt(temp1[0]);
		int queNum=Integer.parseInt(temp1[1]);
		int[] score=new int[queNum];
		String[] temp2=in.readLine().split(" ");
		int sum;
		for(int i=0;i<queNum;i++)
			score[i]=Integer.parseInt(temp2[i]);
		String ans=in.readLine().replace(" ", "");
		for(int i=0;i<stuNum;i++)
		{
			sum=0;
			String result=in.readLine().replace(" ","");
			for(int j=0;j<queNum;j++)
			{
				if(result.charAt(j)==ans.charAt(j))
					sum+=score[j];
			}
			System.out.println(sum);
		}
		in.close();
		}
}
