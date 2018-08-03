package YiJi;

import java.util.Arrays;
import java.util.Scanner;



 
public class no1019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        int[] num=compute(str);
        if(num[2]==0)
        	System.out.println(str+" - "+str+" = "+"0000");
        else
        {
        	while(num[2]!=6174)
        	{
        		System.out.printf("%04d - %04d = %04d\n",num[0],num[1],num[2]);
        		str=num[2]+"";
        		num=compute(str);         
        	}
        	System.out.printf("%04d - %04d = %04d\n",num[0],num[1],num[2]);
            	
        }
        in.close();
    }
 
  public static int[] compute(String k)
  {
	  while(k.length()<4)
		  k="0"+k;
	  int[] temp=new int[4];
	  for(int i=0,length=k.length();i<length;i++)
	  {
		  temp[i]=k.charAt(i)-'0';
	  }
	  Arrays.sort(temp);
      int a=temp[0]*1000+temp[1]*100+temp[2]*10+temp[3];//升序
	  int b=temp[3]*1000+temp[2]*100+temp[1]*10+temp[0];//降序
      int[] com= {b,a,b-a};
	  return com;
	  
  }
}
