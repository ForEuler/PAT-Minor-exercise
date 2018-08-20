package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class no1050 {
	public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(in.readLine());
        String temp[]=in.readLine().split(" ");
        in.close();
        Integer[] nums=new Integer[N];
        for(int i=0;i<N;i++)
        	nums[i]=Integer.parseInt(temp[i]);
        int m=0;
        int n=0;
        int min=10001;
        for(int i=0;i<=N;i++){
            for(int j=0;j<=i;j++){
                if(i*j==N&&(i-j)<min){//在符合条件的数中寻找差最小的数，并记录下来
                    min=i-j;
                    m=i;
                    n=j;
                }
            }   
        }
        Comparator<Integer> cmp = new MyComparator();
        Arrays.sort(nums,cmp);
        int[][] number=new int[m][n];
        number[0][0]=nums[0];
        int i=0;
        int j=0;
        int k=1;
        while(k<N)
        {
        	while(j+1<n&&number[i][j+1]==0) number[i][++j]=nums[k++];
        	while(i+1<m&&number[i+1][j]==0) number[++i][j]=nums[k++];
        	while(j-1>=0&&number[i][j-1]==0) number[i][--j]=nums[k++];
        	while(i-1>=0&&number[i-1][j]==0) number[--i][j]=nums[k++];
        }
        for(i=0;i<m;i++)
        {	for(j=0;j<n;j++)
        	{
        		System.out.print(number[i][j]);
        		if(j!=n-1)
        			System.out.print(" ");
        	}  
        if(i!=m-1)
			System.out.println();
        }
	}
	
}
class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
}
