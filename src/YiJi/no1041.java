package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class no1041 {
	 public static void main(String[] args) throws Exception {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int N=Integer.parseInt(in.readLine());
	        student[] students=new student[N];
	        for(int i=0;i<N;i++)
	        {
	        	String[] temp=in.readLine().split(" ");
	        	student stu=new student(temp[0],temp[1],temp[2]);	
	        	students[i]=stu;
	        }	
	        int M=Integer.parseInt(in.readLine());
	        String[] testnum=in.readLine().split(" ");
	        in.close();
	        for(int i=0;i<M;i++)
	        {
	        	for(int j=0;j<N;j++)
	        	{
	        		if(testnum[i].equals(students[j].seat1))
	        		{
	        			students[j].print();
	        			break;
	        		}
	        	}
	        }
	 }
}
class student
{
	String no;
	String seat1;
	String seat2;
	public student() {}
	public student(String no, String seat1, String seat2) {
		super();
		this.no = no;
		this.seat1 = seat1;
		this.seat2 = seat2;
	}
	void print()
	{
		System.out.println(no+" "+seat2);
	}
}