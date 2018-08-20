package YiJi;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;


public class no1015 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] temp=in.readLine().split(" ");
		int N=Integer.parseInt(temp[0]);
		int L=Integer.parseInt(temp[1]);
		int H=Integer.parseInt(temp[2]);
		ArrayList<stu> class1=new ArrayList<stu>();
		ArrayList<stu> class2=new ArrayList<stu>();
		ArrayList<stu> class3=new ArrayList<stu>();
		ArrayList<stu> class4=new ArrayList<stu>();
	    for(int i=0;i<N;i++)
	    {
	       temp=in.readLine().split(" ");
	    	stu student=new stu(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),Integer.parseInt(temp[2]));
	    	if(student.moral>=L&&student.talent>=L)
	    	{
	    		if(student.moral>=H&&student.talent>=H)
	    		class1.add(student);
	    		else if(student.moral>=H)
	    		class2.add(student);
	    		else if(student.moral>=student.talent)
	        	class3.add(student);
	        	else
	        	class4.add(student);
	    	} 		 
	   }
	    in.close();
	    Comparator<stu> comp=new Comparator<stu>() {
			public int compare(stu o1,stu o2) {
				if(o1.moral+o1.talent!=o2.moral+o2.talent)
					return o2.moral+o2.talent-o1.moral-o1.talent;
				if(o1.moral!=o2.moral)
					return o2.moral-o1.moral;
				else
					return o1.id-o2.id;
			}
		};
		java.util.Collections.sort(class1, comp);
		java.util.Collections.sort(class2, comp);
		java.util.Collections.sort(class3, comp);
		java.util.Collections.sort(class4, comp);
	    System.out.println(class1.size()+class2.size()+class3.size()+class4.size());
		for(int i=0,length=class1.size();i<length;i++)
			System.out.println(class1.get(i).id+" "+class1.get(i).moral+" "+class1.get(i).talent);
		for(int i=0,length=class2.size();i<length;i++)
			System.out.println(class2.get(i).id+" "+class2.get(i).moral+" "+class2.get(i).talent);
		for(int i=0,length=class3.size();i<length;i++)
			System.out.println(class3.get(i).id+" "+class3.get(i).moral+" "+class3.get(i).talent);
		for(int i=0,length=class4.size();i<length;i++)
			System.out.println(class4.get(i).id+" "+class4.get(i).moral+" "+class4.get(i).talent);
	 }
	
	     static class stu {
	        int id;
	        int moral;
	        int talent;
	        public stu(int id,int moral,int talent) {
				this.id=id;
				this.moral=moral;
				this.talent=talent;
			}
			
	    }
}
