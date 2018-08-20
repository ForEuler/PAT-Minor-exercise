package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class no1062 {
		public static void main(String[] args) throws IOException
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			String[] temp=in.readLine().split(" ");
			String[] num=temp[0].split("/");
			int n1=Integer.parseInt(num[0]);
			int m1=Integer.parseInt(num[1]);
			num=temp[1].split("/");
			int n2=Integer.parseInt(num[0]);
			int m2=Integer.parseInt(num[1]);
			int m3=Integer.parseInt(temp[2]);
			if(n1*m2>n2*m1)	
				{
				int n=n1;
				n1=n2;
				n2=n;
				int m=m1;
				m1=m2;
				m2=m;
				}
			int n3=1;
			int flag=0;
			while(n1*m3>=n3*m1) n3++;
			while(n1*m3<n3*m1&&n2*m3>n3*m2)
			{
				if(gcd(n3,m3)==1)
				{	System.out.print((flag==0?"":" ")+n3+"/"+m3);
				flag=1;
				}
				n3++;
			}
			
			
		}
		public static int gcd(int a,int b)
		{
			int max=(a>b)?a:b;
			int min=(a<b)?a:b;
			if(max%min!=0)
	        return gcd(min,max%min);
			 else
		     return min;
		}

}
