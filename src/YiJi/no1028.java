package YiJi;

import java.util.Scanner;

public class no1028 {
	public static void main(String[] args) 
	  {
	   Scanner in = new Scanner(System.in);
	   int num=in.nextInt();
	   int olderIndex=0;
	   int youngerIndex=0;
	   int countLegal=0;
	   person[] people=new person[num];
	   for(int i=0;i<num;i++)
	   {
		   String name=in.next();
		   String[] temp=in.next().split("/");
		   people[i]=new person(name,temp[0]+temp[1]+temp[2]);
	   }
	   in.close();
	   for(int i=0;i<num;i++)
	  {
		   
          if(people[i].isLegal()==false)
		   continue;
          countLegal++;
          if(people[i].isOlder(people[olderIndex]))
			   olderIndex=i;
		   if(people[i].isYounger(people[youngerIndex]))
			   youngerIndex=i;
	  }
	   System.out.print(countLegal+" "+people[olderIndex].name+" "+people[youngerIndex].name);
	 }
	  
}
class person
{
	String name;
	String date;
	public person() {}
	public person(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}
	public boolean isYounger(person person) {
		int temp=Integer.parseInt(date);
		if(temp<Integer.parseInt(person.date))
			return true;
		else
			return false;
	}
	public boolean isOlder(person person) {
		int temp=Integer.parseInt(date);
		if(temp>Integer.parseInt(person.date))
			return true;
		else
			return false;
	}
	boolean isLegal()
	{
	   int temp=Integer.parseInt(date);
	   if(temp>20140906||20140906-temp>2000000)
		   return false;
	   else
		   return true;
	}
	
}
