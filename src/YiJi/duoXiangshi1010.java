package YiJi;

import java.util.Scanner;


public class duoXiangshi1010 {
	public static void main(String[] args)
	  {
	    Scanner in=new Scanner(System.in);
	    String str=in.nextLine();
	    String out="";
	    String[] nums=str.split("\\s+");
	    for(int i=0;i<nums.length;i+=2)
	    {
	    	   int A=Integer.parseInt(nums[i]);
	    	   int B=Integer.parseInt(nums[i+1]);
	    	   int DaoA=A*B;
	    	   int DaoB=B-1;
	    	   if(i==0&&B==0)//0多项式
	    		   out="0 0";
	    		 if(DaoA == 0)
				   continue;
          out=out+DaoA+" "+DaoB+" ";
	    }
	    System.out.print(out.trim());
	    in.close();
	  }
}
