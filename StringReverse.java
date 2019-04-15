import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		/*String s = "stringreverse";
		//StringBuilder sbuild = new StringBuilder(s);
		//sbuild.reverse();
		//System.out.println(sbuild);
		char arr[] = s.toCharArray();
		//System.out.println(arr.length);
		
		for(int i=(arr.length)-1;i>=0;i--){
			System.out.print(arr[i]);
		}*/
		String s; //a4b10
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the input string");
		s = ip.next();
		char a[];
		char ch = 0;
		a = s.toCharArray();
		for(int i=0;i<a.length;i++){
			int count = 0,n = 0,num = 0;
			if(a[i] >= 'a' && a[i] <='z'){
				ch = a[i];
			}
			while(i <= a.length-1 && a[i] >='0' && a[i] <='9'){
				count = n + (a[i] - '0');
				n = count*10;
				if(i <= a.length-2 && a[i+1] >='0' && a[i+1] <= '9'){
					i++;
				}
				else
					break;
			}
			for(int j=0;j<count;j++){
				System.out.print(ch+" ");
			}
		}
	}

}
