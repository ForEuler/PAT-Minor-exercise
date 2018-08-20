package YiJi;

import java.util.Scanner;


public class no1008 {
	 public static void main(String[] args)
	  {
	    Scanner in=new Scanner(System.in);
	    //读数
	    int N=in.nextInt();
	    int M=in.nextInt();
	    M%=N;//M取模N
	    int[] nums=new int[N];
	    for(int i=0;i<nums.length;i++)
	    	nums[i]=in.nextInt();
	    shift(nums,0,N-M-1);
	    shift(nums, N-M, N-1);
	    shift(nums,0,N-1);
	    for(int i=0;i<nums.length;i++)
	    {   
	    	if(i!=nums.length-1)
	    	System.out.print(nums[i]+" ");
	    	else
	    		System.out.print(nums[i]);
	    }
	    in.close();	    
	  }
	 static void shift(int nums[],int begin,int end)
	 {
		 int temp;
		 while(begin<end)
		 {
			 temp=nums[begin];
			 nums[begin]=nums[end];
			 nums[end]=temp;
			 begin++;
			 end--;
		 }
	 }

}
