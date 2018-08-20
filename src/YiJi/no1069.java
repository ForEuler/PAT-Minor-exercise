package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class no1069 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] s1=in.readLine().split(" ");
		int M=Integer.parseInt(s1[0]);
		int N=Integer.parseInt(s1[1]);
		int S=Integer.parseInt(s1[2]);
		String[] people=new String[M];
		HashMap<String, Boolean> recieved=new HashMap<String,Boolean>();
		for(int i=0;i<M;i++)
		{
			people[i]=in.readLine();
			recieved.put(people[i], false);
		}
		in.close();
		int flag=0;
		for(int i=S-1;i<M;i+=N)
		{
			if(recieved.get(people[i])==false)
			{
				System.out.println(people[i]);
				recieved.put(people[i],true);
				flag=1;
			}
			else
				i=i+1-N;
		}
		if(flag==0)
			System.out.print("Keep going...");
	}
}
