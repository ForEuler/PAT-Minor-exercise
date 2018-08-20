package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class no1045 {
	 public static void main(String[] args) throws Exception {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int N=Integer.parseInt(in.readLine());
	        int[] before=new int[N];
	        int[] after=new int[N];
	        String[] temp=in.readLine().split(" ");
	        in.close();
	        for(int i=0;i<N;i++)
	        	{
	        	after[i]=Integer.parseInt(temp[i]);
	        	before[i]=after[i];
	        	}
	       Arrays.sort(after);
	       int maxIndex=0;
	       int count=0;
	       String result="";
	       for(int i=0;i<N;i++)
	       {
	    	   if(before[i]>before[maxIndex])
	    		   maxIndex=i;
	    	   if(after[i]==before[i]&&maxIndex==i)
	    	   {
	    		  result+=before[i]+" ";
	    	      count++;
	    	   }
	       }
	       System.out.println(count);
	       System.out.print(result.trim());
	        	        
 	 }
}
