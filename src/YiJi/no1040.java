package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no1040 {
	 public static void main(String[] args) throws Exception {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        char[] s=in.readLine().toCharArray();
	        int length=s.length;
	        int tnumber=0;
	        int pnumber=0;
	        int total=0;
	        for (int i = 0; i < length; i++) {
	            if (s[i] == 'T')
	                tnumber++;
	        }
	        for(int i=0;i<length;i++)
	        {
	        	if(s[i]=='P')
	        		pnumber++;
	        	if(s[i]=='T')
	        		tnumber--;
	        	if(s[i]=='A')
	        	{
	        		total+=pnumber*tnumber;
	        		if(total>1000000007)
	        			total=total%1000000007;
	        	}
	        		
	        }
	        System.out.print(total);
	        
	 }
}
