package YiJi;

import java.util.Scanner;


public class no1003 {
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		String number=in.nextLine();
		String[] strs= new String[Integer.parseInt(number)];
		for(int i=0;i<strs.length;i++)
         {
			strs[i]=in.nextLine();
			if(strs[i].matches("A*PA+TA*"))//所有的都必须满足此形式
				{
				if(strs[i].matches("PA+T"))//PT两边是空串中间至少为一个A即可
					{
					System.out.println("YES");
					}
			    else//PT两边不是空串判断PT左右中A的数量关系
			    {
			      String temp[] = strs[i].split("P|T");
	               int A1 = temp[0].length();
			       int A2 = temp[1].length();
			       int A3 = temp[2].length();
			       if((A3-A1)/A1==A2-1)//根据条件二
			        System.out.println("YES");
			       else
			    	   System.out.println("NO");
			    }
				}
				else
					System.out.println("NO");		    
			
         }
		in.close();
		
	}
}


