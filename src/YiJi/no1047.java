package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no1047 {
	public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(in.readLine());
        int[] team=new int[1000+1];
        for(int i=0;i<1000;i++)
        	team[i]=0;
        for(int i=0;i<N;i++)
        {
        	String[] temp=in.readLine().split(" |-");
        	int t=Integer.parseInt(temp[0]);
        	int score=Integer.parseInt(temp[2]);
        	team[t]+=score;
        }
        in.close();
        int maxIndex=0;
        int j=0;
       for(j=0;j<1001;j++)
       {
    	   if(team[j]>team[maxIndex])
    		   maxIndex=j;
       }
       System.out.print(maxIndex+" "+team[maxIndex]);
	}
}
