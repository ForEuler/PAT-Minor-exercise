package YiJi;

import java.util.ArrayList;
import java.util.Scanner;


public class no1005 {
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		String number=in.nextLine();
		int[] nums=new int[Integer.parseInt(number)];//存放接收到的数
		for(int i=0;i<nums.length;i++)
			nums[i]=in.nextInt();
		int[] frontnum=new int[Integer.parseInt(number)];//每个元素的值代表对应下标的数的覆盖数
		for(int i=0;i<frontnum.length;i++)
			frontnum[i]=-1;//初始的时候设置每个数的覆盖数为-1 代表不存在
		for(int i=0;i<nums.length;i++)
		{
			int temp=nums[i];
			while(frontnum[i]==-1&&temp!=1)//如果这个数还没有被覆盖并且不等于1
			{
				if(temp%2==1)
				 temp=3*temp+1;
				 temp/=2;
				 for(int j=0;j<nums.length;j++)
				 {
				 if(temp==nums[j])
				  frontnum[j]=i;
			     }
	      	}		
	    }
		ArrayList<Integer> result =new ArrayList<Integer>();
		for(int i=0;i<frontnum.length;i++)
		{
			if(frontnum[i]==-1)
				result.add(nums[i]);
		}
		java.util.Collections.sort(result);
		java.util.Collections.reverse(result);
		for(int i=0;i<result.size();i++)
		{
			if(i!=result.size()-1)
			System.out.print(result.get(i)+" ");
			else
				System.out.print(result.get(i));	
		}
		in.close();
	}
	
	

}
