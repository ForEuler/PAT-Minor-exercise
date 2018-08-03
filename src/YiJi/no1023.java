package YiJi;

import java.util.Scanner;

public class no1023 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String[] temp=in.nextLine().split(" ");
		in.close();
		StringBuffer min=new StringBuffer();
		for(int i=1;i<10;i++)
		{
			int num=Integer.parseInt(temp[i]);
			if(num!=0)
			{
				min.append(Integer.toString(i));
				temp[i]=Integer.toString(num-1);
				break;
			}
		}
		for(int i=0;i<10;i++)
		{
			int num=Integer.parseInt(temp[i]);
			if(num==0)
				continue;
			else
				for(int j=0;j<num;j++)
				min.append(Integer.toString(i));
		}
		System.out.print(min);
	}
	
}
