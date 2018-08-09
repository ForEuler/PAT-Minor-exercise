package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no1042 {
	 public static void main(String[] args) throws Exception {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String s=in.readLine();
	        in.close();
	        s=s.toLowerCase();
	        int slength=s.length();
	        int[] letter=new int [26];
	        for(int i=0;i<26;i++)
	        	letter[i]=0;
	        for(int i=0;i<slength;i++)
	        {
	        	char temp=s.charAt(i);
	        	if(temp>='a'&&temp<='z')
	        		letter[temp-'a']++;
	        }
	        int maxIndex=0;        
	        for(int i=0;i<26;i++)
	        {
	        	if(letter[i]>letter[maxIndex])
	        		maxIndex=i;      		
	        }
	        System.out.print((char)(maxIndex+'a')+" "+letter[maxIndex]);     	
	        
	 }
}
