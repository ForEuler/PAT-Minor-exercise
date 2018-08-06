package YiJi;

import java.util.Arrays;
import java.util.Scanner;

public class no1030 {
	public static void main(String[] args)  
	  {
		 Scanner in = new Scanner(System.in);
		 int N=in.nextInt();
		 int p=in.nextInt();
		 in.nextLine();
		 int[] nums=new int[N];
		  String[] temp =in.nextLine().split(" ");
		 for(int i=0;i<N;i++)
			 nums[i]=Integer.parseInt(temp[i]);
		 in.close();
		 Arrays.sort(nums);
		 int cnt=1;
		 for(int i=N-1;i>=1;i--)
		 {
			 int number=1;
			 for(int j=i-cnt;j>=0&& nums[i] * 1.0 /nums[j] <= p;j--)
				 number=i-j+1;
			 cnt=cnt>number?cnt:number;
		 }
		 System.out.print(cnt);
			 
	  }
}
