package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1032 {
	public static void main(String[] args) throws IOException  
	  {
	         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			 int N=Integer.parseInt(in.readLine());	
			 int[] schools=new int[N+1];
			 int maxIndex=1;
			 for(int i=0;i<N;i++)
			 {
				 String[] temp=in.readLine().split(" ");
				 int school= Integer.parseInt(temp[0]);
				 int score=Integer.parseInt(temp[1]);
				 schools[school]+=score;
			 }
			 for(int i=0;i<N+1;i++)
			 {
				 if(schools[i]>schools[maxIndex])
					 maxIndex=i;				 
			 }
			 System.out.print(maxIndex+" "+schools[maxIndex]);
      }
}
