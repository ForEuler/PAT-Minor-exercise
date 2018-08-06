package YiJi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
		 int j=0;int k=N-1;
		 while(j<k)
		 {
			 if(nums[k]<=nums[j]*p)
				 break;
			 else if(nums[k]<=nums[j+1]*p)
			   { j++;break;}
			 else if(nums[k-1]<=nums[j]*p)
			   { k--;break;}
			 else
			 {
				 j++;
				 k--;
			 }
				
		 }
		 System.out.print(k-j+1);
			 
	  }
}