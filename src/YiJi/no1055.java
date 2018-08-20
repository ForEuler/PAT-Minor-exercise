package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class no1055 {
	public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] temp=in.readLine().split(" ");
        int N=Integer.parseInt(temp[0]);
        int K=Integer.parseInt(temp[1]);
        people[] students=new people[N];
        for(int i=0;i<N;i++)
        {
        	String[] info=in.readLine().split(" ");
        	students[i]=new people(info[0],Integer.parseInt(info[1]));
        }
        in.close();
        Arrays.sort(students);
        int per=N/K;
        for(int i=K;i>=1;i--)
        {
        	int len=0;
        	int index=0;
        	if(i==K)
        	{
        		len=N-per*(K-1);
        		index=N-1;
        	}
        	else
        	{
        		len=per;
        		index=i*per-1;
        	}
        	people[] perRow=new people[len];
        	int left=len/2;
        	int right=len/2;
        	perRow[left]=students[index--];
        	left--;
        	right++;
        	while(left>=0&&right<len)
        	{
        		perRow[left--]=students[index--];
        		perRow[right++]=students[index--];
        	}
        	if(left>=0)
        		perRow[left]=students[index];
        	else if(right<len)
        		perRow[right]=students[index];
        		for(int k=0;k<len-1;k++)
        		System.out.print(perRow[k].name+" ");
        		System.out.println(perRow[len-1].name);
        }
        
	}
}
 class people implements Comparable<people>{
	String name;
	int height;
	public people(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}

	@Override
	public int compareTo(people o) {
         if(this.height<o.height)
        	 return -1;
         if(this.height>o.height)
        	 return 1;
         else
        	 return -(this.name.compareTo(o.name));
         
	}

	
}
