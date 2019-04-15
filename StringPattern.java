
public class StringPattern {

	public static void main(String[] args) {
		String s = "program";
		int length = s.length();
		int mid = length / 2;
		String main = new String();
		main = s.substring(mid, length);
		main = main + s.substring(0, mid);
		char array[];
		array = main.toCharArray();
		int j = 0;
		while (j < length) {

			for (int i = 0; i < length - j - 1; i++) {
				System.out.print("\t");
			}

			printPattern(array, j);
			j++;
		}
		//grampro
		//System.out.println(main.length());
		/*while(k >= j){
			
			System.out.print(main.substring(0,main.length()-k));
			System.out.print("\t");
			System.out.println();
			k--;
		}*/

	}

	public static void printPattern(char array[], int j) {

		for (int i = 0; i <= j; i++) {
			System.out.print(array[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
