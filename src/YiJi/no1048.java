package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no1048 {
	public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] temp=in.readLine().split(" ");
        in.close();
        int less=temp[0].length()-temp[1].length();
        for(int i=0;i<less;i++)
        	temp[1]="0"+temp[1];
        char[] A=temp[0].toCharArray();
        char[] B=temp[1].toCharArray();
        char[] num= {'0','1','2','3','4','5','6','7','8','9','J','Q','K'};
        int Alength=A.length;
        int Blength=B.length;   
        int flag=0;
        for(int i=Blength-1,j=Alength-1;i>=0&&j>=0;i--,j--)
        {
        	if(flag==1)
        		{
        		 char c=(char)('0'+(B[i]-A[j]+10)%10);
        		 B[i]=c;
        		 flag=0;
        		}
        	else  		
        		{
        		int c=(B[i]+A[j]-'0'-'0')%13;
        		B[i]=num[c];
        		flag=1;
        		}
        }	  
       for(char c:B)
    	  System.out.print(c);
        	
	}
}
