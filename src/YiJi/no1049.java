package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no1049 {
	public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(in.readLine());
        String[] temp=in.readLine().split(" ");
        in.close();
        float[] nums=new float[N];
        float sum=0;
        for(int i=0;i<N;i++)
        {
        	nums[i]=Float.parseFloat(temp[i]);
        	sum+=(i+1)*(N-i)*nums[i];
        }
        System.out.printf("%.2f",sum);
        
	}
}
