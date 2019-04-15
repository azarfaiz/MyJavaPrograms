import java.util.Arrays;
import java.util.Scanner;

////////////////////////////reverse the string except the vowels////////////////////////////
public class Latest {

	public static void main(String[] args) {
		/*String s1 = "mango";   //ganmo (output)
		char ch[];
		ch = s1.toCharArray();
		int j = 0;
		int k = s1.length() - 1;
		char c = ' ';
		for(int i=0;i<=s1.length()/2;i++){
			if((ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u') && 
					(ch[k] != 'a' && ch[k] != 'e' && ch[k] != 'i' && ch[k] != 'o' && ch[k] != 'u')){
				c = ch[j];
				ch[j] = ch[k];
				ch[k] = c;
				j++;
				k--;
			}
			else if((ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u') &&
					(ch[k] == 'a' || ch[k] == 'e' || ch[k] == 'i' || ch[k] == 'o' || ch[k] == 'u')){
				j++;
				k--;
			}
			else if(ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u'){
				k--;
			}
			else if(ch[k] != 'a' && ch[k] != 'e' && ch[k] != 'i' && ch[k] != 'o' && ch[k] != 'u'){
				j++;
			}
			
		}
		
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
		*/
		
		
////////////////////////A=1 Z=26 AA=27 AZ=52 BA=53 BZ=78 ZZ=702////////////////////////////
		/*int N = 703;
		int R;
		char c[] = new char[10];
		int i=0;
		boolean flag = true;
		System.out.println("Enter the number");
		Scanner ip = new Scanner(System.in);
		N = ip.nextInt();
		while(N > 26 || flag){
			R = N%26;
			N = N/26;
			if(R == 0){
				if(N <=27){
					N--;
				}
					c[i++] = 'Z';
			}
			else{
				c[i++] = (char) (R+64);
			}
			
			if(N<=26 && N!=0){
				c[i++] = (char) (N+64);
			}
			flag = false;
		}
		
		for(int j=i;j>=0;j--){
			System.out.print(c[j]);
		}*/
			
		
////////////////////////////program to find whether the number is a mono digit or not////////////////////////////
		/*String st = "3038563";
		char ch[];
		ch = st.toCharArray();
		boolean flag = false;
		for(int i=0;i<st.length();i=i+2){
			int num =  ch[i] - '0';
			int sum = 0;
			int diff = 0;
			flag = true;
			for(int k=i+1;k<st.length();k=k+2){
				sum = (ch[k] - '0') + (ch[k+1] - '0');
				diff = (ch[k] - '0') - (ch[k+1] - '0');
				if(sum != num && diff !=num){
					flag = false;
					break;
				}
			}
		
			for(int k=i-1;k>0;k-=2){
				sum = (ch[k-1] - '0') + (ch[k] - '0');
				diff = (ch[k-1] - '0') - (ch[k] - '0');
				if(sum !=num && diff != num){
					flag = false;
					break;
				}
			}
			
			if(flag)
				break;
			
		}
		
		if(flag)
			System.out.println("The number is the mono number");
		else
			System.out.println("Not a mono number");*/
		
////////////////////////////find the nearest 1's in the matrix////////////////////////////
		final int row = 4;
		final int column = 4;
		int a[][] = {{0,0,0,100},{0,0,0,0},{0,0,0,100},{0,0,0,100}};
		int one[] = {-1,0,1,0};
		int two[] = {0,-1,0,1};
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(a[i][j] == 100){
					for(int k=0;k<4;k++){
						int b1,b2;
						b1 = i + one[k];
						b2 = j + two[k];
						if((b1>=0 && b1<row) && (b2>=0 && b2<column)){
							if(a[b1][b2] !=100)
								a[b1][b2] = 1;
						}
					}
				}
			}
		}
		
		boolean flag = true;
		while(flag){
			int count = 0;
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					if(a[i][j] == 0){
						count++;
						int min = 1000;
						for(int k=0;k<4;k++){
							int b1,b2;
							b1 = i + one[k];
							b2 = j + two[k];
							if((b1>=0 && b1<row) && (b2>=0 && b2<column)){
								if(a[b1][b2] > 0)
									min = Math.min(min, a[b1][b2]);
							}
						}
						if(min > 0 && min !=1000)
							a[i][j] = min+1;
					}
					
				}
			}
			if(count == 0)
				flag = false;
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(a[i][j] == 100){
					a[i][j] = 0;
				}
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
