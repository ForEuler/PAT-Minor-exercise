package YiJi;

import java.util.Scanner;


public class no1016 {
	  public static void main(String[] args)
	  {
	    Scanner in= new Scanner(System.in);
	    String A=in.next();
	    String Da=in.next();
	    String B=in.next();
	    String Db=in.next();
	    StringBuffer result1=new StringBuffer();
	    StringBuffer result2=new StringBuffer();
	    int sum=0;
	    for(int i=0,length=A.length();i<length;i++)
	    if(String.valueOf(A.charAt(i)).equals(Da))
	    	result1.append(Da);
	    if(result1.length()>0)
	    sum+=Integer.parseInt(String.valueOf(result1));
	    for(int i=0,length=B.length();i<length;i++)
		    if(String.valueOf(B.charAt(i)).equals(Db))
		    	result2.append(Db);
	    if(result2.length()>0)
	    sum+=Integer.parseInt(String.valueOf(result2));
	    System.out.print(sum);
	    in.close();
	  }
}
