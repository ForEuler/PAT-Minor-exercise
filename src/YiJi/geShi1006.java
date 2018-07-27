package YiJi;
import java.util.Scanner;


public class geShi1006 {
	 public static void main(String[] args)
	  {
	    Scanner in=new Scanner(System.in);
	    String str=in.next();
	    int count1=0;
	    int count2=0;
	    int count3=0;
	    String[] temp=str.split("");
	    if(temp.length==1)
	    	count3=Integer.parseInt(temp[0]);
	    if(temp.length==2)
	    	{
	    	count2=Integer.parseInt(temp[0]);
	    	count3=Integer.parseInt(temp[1]);
	    	}
	    if(temp.length==3)
	    {
	    	count1=Integer.parseInt(temp[0]);
	    	count2=Integer.parseInt(temp[1]);
	    	count3=Integer.parseInt(temp[2]);
	    }
	    StringBuffer result=new StringBuffer();
	    for(int i=0;i<count1;i++)
	    	result.append("B");
	    for(int i=0;i<count2;i++)
	    	result.append("S");
	    for(int i=0;i<count3;i++)
	    	result.append(Integer.toString(i+1));
	    System.out.print(result);
	    in.close();
	  }
}
