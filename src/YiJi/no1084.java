package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class no1084 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split("\\s");
        String d = s[0];
        int n = Integer.parseInt(s[1]);
        for(int i = 0; i < n-1; i ++){
        	String temp = "";
        	char c = d.charAt(0);
        	int count = 0;
        	char a,b;
        	int  e,f;
        	for(int j = 0; j < d.length(); j ++){
        		if(d.charAt(j) == c){
        			count ++;
        		}
        		else{
        			a = c;
        			temp += String.valueOf(a);
        			e = count;
        			temp += String.valueOf(e);
        			c = d.charAt(j);
        			count = 1;
        		}
        	}
        	if(count > 0){
        		b = c;
        		temp += String.valueOf(b);
        		f = count;
    			temp += String.valueOf(f);
        	}
        	d = temp;
        }
        System.out.print(d);
    }
}