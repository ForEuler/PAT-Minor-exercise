package YiJi;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class no1053 {
		public static void main(String[] args) throws Exception {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String[] firstrow=in.readLine().split(" ");
	        int people=Integer.parseInt(firstrow[0]);
	        float e=Float.parseFloat(firstrow[1]);
	        int D=Integer.parseInt(firstrow[2]);
	        int countMay=0;
	        int countMust=0;
	        for(int i=0;i<people;i++)
	        {
	        	String[] home=in.readLine().split(" ");
	        	int day=Integer.parseInt(home[0]);
	        	int count=0;
	        	int j;
	        	for(j=1;j<=day;j++)
	        	{
	        		if(Float.parseFloat(home[j])<e)
	        			count++;
	        	}
        		if(count>day/2)
	        	 {
        			if(day>D)
	        		countMust++;    
        			else
        				countMay++;
	        	 }
	        }
	        in.close();
	        System.out.printf("%.1f%% %.1f%%",countMay*1.0/people*100,countMust*1.0/people*100);
		}
}
