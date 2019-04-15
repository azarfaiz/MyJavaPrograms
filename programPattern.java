import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class programPattern {

	public static void main(String[] args) throws IOException {
		
		//display pattern using the matrix
		/*String st = "PROGRAM";
		int n = st.length();
		char s[][] = new char[n][n];
		
		for(int i=0;i<n;i++){
			s[i][i] = st.charAt(i);
			s[i][n-i-1] = st.charAt(n-i-1);
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(s[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}*/
		
		//display pattern without matrix
		String st = "PROGRAM";
		int len = st.length();
		int j,k;
		for(int i=0;i<len;i++){
			if(i <= len/2){
				for(j=0;j<i;j++){
					System.out.print("\t");
				}
				System.out.print(st.charAt(i));
				for(k=0;k<len-j-i-1;k++){
					System.out.print("\t");
				}
				if(i != (len/2)){
					System.out.print(st.charAt(len-1-i));
				}
				System.out.println();
			}
			else{
				for(k=0;k<len-i-1;k++){
					System.out.print("\t");
				}
				System.out.print(st.charAt(len-1-i));
				for(j=0;j<i-k;j++){
					System.out.print("\t");
				}
				System.out.print(st.charAt(i));
				System.out.println();
			}
			
		}
		
		//find the count of grand children given 2D string
		
		/*String st[][] = {{"luke","wayne"},
				{"wayne","rooney"},
			{"rooney","ronaldo"},
					{"shaw","david"}};
		
		Scanner ip = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name for which the grandchild count to be known");
		//String name = ip.nextLine();
		String name = br.readLine();
		String name1 = null;
		boolean flag = false;
		int grandCount=0;
		for(int i=0;i<4;i++){
				if(name.equals(st[i][1])){
					name1 = st[i][0];
					flag = true;
					
				}
				else{
					System.out.println("Enter valid name");
					flag = false;
					break;
				}
		}
		if(flag){
			grandCount = Child(name1,st);
		}
		System.out.println("The number of grandchildren of "+name+" is : "+grandCount);
		
	}

	private static int Child(String name1,String s[][]) {
		int count = 0;
		for(int i=0;i<4;i++){
				if(s[i][1]==name1){
					count++;
					}
			}
		return count; */
	}

}
