package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1071 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] s=in.readLine().split(" ");
		int token=Integer.parseInt(s[0]);
		int K=Integer.parseInt(s[1]);
		for(int i=0;i<K;i++)
		{
			String[] temp=in.readLine().split(" ");
			int n1=Integer.parseInt(temp[0]);
			int b=Integer.parseInt(temp[1]);
			int t=Integer.parseInt(temp[2]);
			int n2=Integer.parseInt(temp[3]);
			if(token>=t)
			{
				if((n2<n1&&b==0)||(n2>n1)&&b==1)
				{token+=t;System.out.printf("Win %d!  Total = %d.\n",t,token);}
			    else
				{token-=t;System.out.printf("Lose %d.  Total = %d.\n",t,token);}
			    if(token<=0)
				{ System.out.print("Game Over.");break;}
			}
			else
			{
				System.out.printf("Not enough tokens.  Total = %d.\n",token);
			}
		}
		in.close();
	}
	
}
