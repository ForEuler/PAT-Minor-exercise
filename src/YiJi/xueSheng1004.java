package YiJi;

import java.util.Scanner;


public class xueSheng1004 {
	String name;
	String no;
	int score;
	public xueSheng1004() {}
	public xueSheng1004(String info) {
    String[] temp=info.split(" ");
	   name=temp[0];
	   no=temp[1];
	   score=Integer.parseInt(temp[2]);
	}
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}

	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		String number=in.nextLine();
		xueSheng1004[] students=new xueSheng1004[Integer.parseInt(number)];
		for(int i=0;i<students.length;i++)
		{
			String info=in.nextLine();
			students[i]=new xueSheng1004(info);
		}
		printInfo(students); 	
		in.close();
		
	}
	static void printInfo(xueSheng1004[] a)
	{
		int minIndex=0;
		int maxIndex=0;
		for(int i=0;i<a.length;i++)
			{
			  if(a[i].getScore()<a[minIndex].getScore())
				minIndex=i;
			  if(a[i].getScore()>a[maxIndex].getScore())
				  maxIndex=i;
			}
		System.out.println(a[maxIndex].getName()+" "+a[maxIndex].getNo());
		System.out.print(a[minIndex].getName()+" "+a[minIndex].getNo());

				
	}
	
}
