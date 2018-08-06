package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class no1031 {
	public static void main(String[] args) throws IOException  
	  {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 int N=Integer.parseInt(in.readLine());		 
		 LinkedList<String> strs = new LinkedList<String>();
		 for(int i=0;i<N;i++)
		 {
			 String temp=in.readLine();
			 if(isLegal(temp)==false)
			 strs.add(temp); 				 
		 }
		 if(strs.isEmpty()==false)
		 {
			 for(String s:strs)
				 System.out.println(s);
		 }
		 else
			 System.out.print("All passed");
	  }
	public static boolean isLegal(String s)
	{
		int sum=0;
		int[] weight= {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		int[] Z2M= {1,0,10,9,8,7,6,5,4,3,2};
		for(int i=0;i<17;i++)
			{
			char temp=s.charAt(i);
			if(temp<'0'||temp>'9')
				return false;
			else
				sum+=(temp-'0')*weight[i];		
			}
		int Z=sum%11;
		int M=Z2M[Z];
		if(s.charAt(17)=='X')
			{
			   if(M==10)
			    return true;
			   else
				   return false;
			}
		else 
			{
			   if(M==(s.charAt(17)-'0'))
				   return true;
			   else
				   return false;
			}
			
	}
}
