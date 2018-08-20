package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class no1058 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] a=in.readLine().split(" ");
		int stuNumber=Integer.parseInt(a[0]);
		int proNumber=Integer.parseInt(a[1]);
		problem[] p=new problem[proNumber];
		for(int i=0;i<proNumber;i++)
		{
			String[] b=in.readLine().split(" ");
			int tempScore=Integer.parseInt(b[0]);
			int ansNumber=Integer.parseInt(b[2]);
			String s="";
			for(int j=0;j<ansNumber;j++)
					s+=b[j+3];
			p[i]=new problem(tempScore, s);		
		}
		for(int i=0;i<stuNumber;i++)
		{
			String[] stuAnswer=new String[proNumber];
			int count=0;
			String eachAnswer="";
			String s =in.readLine();
			int len=s.length();
			for(int j=0;j<len;j++)
			{
				if(s.charAt(j)=='(')
				{
					j++;
					while(s.charAt(j)!=')')				
				{
				      if(Character.isLowerCase(s.charAt(j))==true)
					  eachAnswer+=s.charAt(j);
				      j++;			      
				}
				{
					stuAnswer[count++]=eachAnswer;
					eachAnswer="";
				}
				}
			}
			stu stu=new stu(stuAnswer);
			stu.test(p);
			stu.print();
		}
		if(problem.allright==true)
			System.out.print("Too simple");
		else
		{
		int maxTime=0;
		ArrayList<Integer> maxs=new ArrayList<Integer>();
		for(int j=0;j<proNumber;j++)
		{
			if(p[j].wrongTimes>maxTime)
				{
				maxs.clear();
				maxTime=p[j].wrongTimes;
				maxs.add(j);
				}
			else if(p[j].wrongTimes==maxTime)
				maxs.add(j);
		}
		int size=maxs.size();
		System.out.print(maxTime);
		for(int j=0;j<size;j++)
		System.out.print(" "+(maxs.get(j)+1));
		}
		
	}
}
class problem {
	int score;
	String answer;
	int wrongTimes=0;
	static boolean allright=true;
	public problem(int score, String answer) {
		super();
		this.score = score;
		this.answer = answer;
	}
	
}
class stu{
	int score=0;
	String[] answers;
	public stu(String[] answers) {
		super();
		this.answers = answers;
	}
	void test(problem[] p)
	{
		int len=p.length;
		for(int i=0;i<len;i++)
		{
			if(answers[i].equals(p[i].answer))
				score+=p[i].score;
			else
				{
				p[i].wrongTimes++;
				problem.allright=false;
				}
			
		}
	}

	void print()
	{
		System.out.println(score);
	}
	
}
