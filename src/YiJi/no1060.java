package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class no1060 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int day=Integer.parseInt(in.readLine());
		Integer[] distance=new Integer[day];
		String[] temp=in.readLine().split(" ");
		in.close();
		for(int i=0;i<day;i++)
		{
			distance[i]=Integer.parseInt(temp[i]);
		}
		Arrays.sort(distance,new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				Integer a=(Integer)o1;
				Integer b=(Integer)o2;
				return b-a;
			}
			
		});
		int count=0;
		int i=0;
		while(distance[i]>i+1&&count<day)
		{
			count++;
			i++;
		}
		System.out.print(count);
	}
}
