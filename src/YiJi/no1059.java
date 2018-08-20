package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class no1059 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		HashMap<String,Integer> myHash=new HashMap<String,Integer>();
		boolean[] isPrime=new boolean[10001];
		isPrime[0]=false;
		isPrime[1]=false;
		for(int i=2;i<10001;i++)
		{
			isPrime[i]=true;
		}
	    for (int k = 2; k <= 10000 / k; k++) {
	        if (isPrime[k]==true) {
	          for (int i = k; i <= 10000 / k; i++) {
	            isPrime[k * i] = false; // k * i is not prime
	          }
	        }
	      }
		int[] checked=new int[N];
		for(int i=0;i<N;i++)
		{
			myHash.put(in.readLine(),i);
		}
		int K=Integer.parseInt(in.readLine());
		String[] temp=new String[K];
		for(int i=0;i<K;i++)
		{
			temp[i]=in.readLine();
		}
		in.close();
		for(int i=0;i<K;i++)
		{
			String s=temp[i];
			if(myHash.get(s)==null)
			{System.out.println(s+": Are you kidding?");}
			else{
			int number=myHash.get(s);
			if(checked[number]!=0)
			{ System.out.println(s+": Checked");}
			else if(number==0)
			{ System.out.println(s+": Mystery Award");checked[number]=1;}
		    else  if(isPrime[number+1])
		    {System.out.println(s+": Minion");checked[number]=1;}
		     else
		    { System.out.println(s+": Chocolate");checked[number]=1;}
			}		
		}
	}
}

