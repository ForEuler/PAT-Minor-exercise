package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class fuErMoSi1014 {
	 public static void main(String[] args) throws IOException
	  {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[4];
		for(int i = 0; i < 4; i++)
			str[i] = in.readLine();
	    String[] week = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
	    boolean hasfirst=false;
	    char ch1=0;
	    char ch2=0;
	    //日子和小时
	    for(int i=0;i<str[0].length()&&i<str[1].length();i++)
	    {
	    	ch1=str[0].charAt(i);
	    	 if(hasfirst==false&&ch1>='A'&&ch1<='G')
	    	   if(ch1==str[1].charAt(i))
	    		{    		     
	    		    hasfirst=true;
	    		    System.out.print(week[ch1-'A']+" ");
	    		    continue;
	    	     }

			if(hasfirst&&ch1==str[1].charAt(i)&&((ch1>='0'&&ch1<='9')||(ch1>='A'&&ch1<='N')))
				{	
						if((ch1>='0'&&ch1<='9'))
							System.out.printf("%02d:",ch1-'0');
						else
							System.out.printf("%02d:",ch1-'A'+10);
						break;
				}
     	}
	    //分钟
	    for(int i=0;i<str[2].length()&&i<str[3].length();i++)
	    {
	    	ch2=str[2].charAt(i);
	    	if(Character.isLetter(ch2)&&ch2==str[3].charAt(i))
    		{
    		     System.out.printf("%02d", i);
    		     break;
    		}
	    }
      in.close();
	  }
}
