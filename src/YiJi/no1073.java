package YiJi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class no1073 {
		public static void main(String[] args) throws IOException
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			String[] a=in.readLine().split(" ");
			int sstudentNumber=Integer.parseInt(a[0]);
			int proNumber=Integer.parseInt(a[1]);
			problemm[] p=new problemm[proNumber];
			for(int i=0;i<proNumber;i++)
			{
				String[] b=in.readLine().split(" ");
				int tempScore=Integer.parseInt(b[0]);
				int ansNumber=Integer.parseInt(b[2]);
				String s="";
				for(int j=0;j<ansNumber;j++)
						s+=b[j+3];
				p[i]=new problemm(tempScore, s);		
			}
			for(int i=0;i<sstudentNumber;i++)
			{
				String[] sstudentAnswer=new String[proNumber];
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
						sstudentAnswer[count++]=eachAnswer;
						eachAnswer="";
					}
					}
				}
				sstudent stu=new sstudent(sstudentAnswer);
			    stu.test(p);
				stu.print();
			}
			in.close();
			if(problemm.allright==true)
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
			for(int j=0;j<size;j++)		
			  {
				int index=maxs.get(j);
				int maxtime=p[index].wrongletter[0];
				for(int i=1;i<5;i++)
					{if(p[index].wrongletter[i]>maxtime)
						maxtime=p[index].wrongletter[i];}
				for(int i=0;i<5;i++)
				{
					if(p[index].wrongletter[i]==maxtime)
				    System.out.println(maxTime+" "+(index+1)+"-"+(char)(i+'a'));	
				}			
			  }		
		   }
	   }
	}
	class problemm {
		int score;
		String answer;
		int wrongTimes=0;
		int[] wrongletter=new int[5];
		static boolean allright=true;
		public problemm(int score, String answer) {
			super();
			this.score = score;
			this.answer = answer;
		}
		
	}
	class sstudent{
		float score=0;
		String[] answers;
		public sstudent(String[] answers) {
			super();
			this.answers = answers;
		}
		void test(problemm[] p)
		{
			int len=p.length;
			for(int i=0;i<len;i++)
			{
				String myAns=answers[i];
				String ans=p[i].answer;
				if(myAns.equals(ans))
					score+=p[i].score;
				else 
					{
					  int l1=myAns.length();
					  int l2=ans.length();
					  int flag=0;
					   for(int j=0;j<l1;j++)
					   {
						   char temp=myAns.charAt(j);
						   if(ans.contains(temp+"")==false)
						   {
							   p[i].wrongletter[temp-'a']++;
							   flag=1;
						   }
					   }
					   for(int j=0;j<l2;j++)
					   {
						   char temp=ans.charAt(j);
						   if(myAns.contains(temp+"")==false)
							   p[i].wrongletter[temp-'a']++;
					   }
					   if(flag==1)
							{
						    problemm.allright=false;
							p[i].wrongTimes++;	
							}
					    else
					    	score+=1.0*p[i].score/2;
					}			

				
			}
		}

		void print()
		{
			System.out.printf("%.1f\n",score);
		}	
	 }

