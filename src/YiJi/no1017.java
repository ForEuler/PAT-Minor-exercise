package YiJi;

import java.util.Scanner;

public class no1017 {
	 public static void main(String[] args)
	  {
	    Scanner in=new Scanner(System.in);
	    String A = in.next();
	    int B=in.nextInt();
	    in.close();
	    StringBuffer Q=new StringBuffer();
	    int R=0;
	    int m=0;
	    for(int i=0,length=A.length();i<length;i++)
	    {
	    	m=R*10+A.charAt(i)-'0';
	    	Q.append(Integer.toString(m/B));
	    	R=m%B;   	
	    }  
	    while (Q.charAt(0)=='0')Q.delete(0,1);
        System.out.println(Q.toString()+" "+R);
	   }
}
