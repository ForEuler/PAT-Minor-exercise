package YiJi;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class no1064 {
		public static void main(String[] args) throws IOException
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			int N=Integer.parseInt(in.readLine());
			String[] numbers=in.readLine().split(" ");
			in.close();
			int[] count=new int[37];
			for(int i=0;i<N;i++)
			{
				int len=numbers[i].length();
				int no=0;
				for(int j=0;j<len;j++)
				no+=numbers[i].charAt(j)-'0';
				count[no]++;
			}
			String res="";
			int num=0;
			for(int i=0;i<37;i++)
			{
				if(count[i]>0)
					{
					num++;
					res+=i+" ";			
					}
			}
			System.out.println(num);
			System.out.print(res.trim());
			
		}
}
