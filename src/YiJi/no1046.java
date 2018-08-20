package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no1046 {
	public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(in.readLine());
        int[] a1=new int[N];
        int[] a2=new int[N];
        int[] b1=new int[N];
        int[] b2=new int[N]; 
        int counta=0;
        int countb=0;
        for(int i=0;i<N;i++)
        {
        	String[] temp=in.readLine().split(" ");
        	a1[i]=Integer.parseInt(temp[0]);
        	a2[i]=Integer.parseInt(temp[1]);
        	b1[i]=Integer.parseInt(temp[2]);
        	b2[i]=Integer.parseInt(temp[3]);
        }
        in.close();
        for(int i=0;i<N;i++)
        {
        	int sum=a1[i]+b1[i];
        	if(a2[i]==sum&&b2[i]!=sum)
        		countb++;
        	else if(b2[i]==sum&&a2[i]!=sum)
        		counta++;
        }
        System.out.print(counta+" "+countb);
	}
}
