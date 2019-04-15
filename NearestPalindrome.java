//program to find the nearest palindrome
public class NearestPalindrome {

	public static void main(String[] args) {
		int number = 1001;
		int flag = 0;
		String st = String.valueOf(number);
		int length = st.length();
		int mid = st.length()/2;
		char array[] = st.toCharArray();
		
		/*for(int i =0;i<mid;i++){
			//array[i] = st.charAt(i);
			array[length-1-i] = array[i];
		}
		
		System.out.println(array);*/
		
		/*if(isPalindrome(number)){
			System.out.println("The number is already a palindrome");
		}*/
		
		while(flag == 0){
			int rev = reverseNumber(number);
			if(rev == number){
				flag = 1;
			}
			if(flag==0)
			number--;
		}
		System.out.println(number);
        
		
	}
	
	public static int reverseNumber(int num){
		int s = 0;
		while(num > 0)
        {
           int x = num % 10;
           s = s * 10 + x;
           num = num / 10;
        }
		return s;
	}
	
	public static boolean isPalindrome(int num){
		int s = 0;
		int temp = num;
		while(num > 0)
        {
           int x = num % 10;
           s = s * 10 + x;
           num = num / 10;
        }
		System.out.println(num);
		System.out.println(s);
		
		return (s == temp);
		
	}

}
