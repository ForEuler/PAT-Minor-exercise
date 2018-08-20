package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no1043 {
	 public static void main(String[] args) throws Exception {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String s=in.readLine();
	        in.close();
	        int slength=s.length();
	        int[] PATtes=new int [6];
	        char[] letter= {'P','A','T','e','s','t'};
	        for(int i=0;i<6;i++)
	        	PATtes[i]=0;
	        for(int i=0;i<slength;i++)
	        {
	        	char temp=s.charAt(i);
	        	switch (temp) {
				case 'P':{PATtes[0]++;break;}		
				case 'A':{PATtes[1]++;break;}
				case 'T':{PATtes[2]++;break;}
				case 'e':{PATtes[3]++;break;}
				case 's':{PATtes[4]++;break;}
				case 't':{PATtes[5]++;break;}
				default:
					break;
				}
	        }
	        String result="";
	        Boolean flag=false;
	        while(true)
	        {
	        	flag=false;
	        	for(int i=0;i<6;i++)
	           {
	        	if(PATtes[i]!=0)
	        		{
	        		flag=true;
	    	        result+=letter[i];
	        		PATtes[i]--;
	        		}  
	            }
	        	if(flag==false)
	        		break;
	        }
	        System.out.print(result);
	        	
	 }
}
