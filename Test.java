
public class Test {

	public static void main(String[] args) {

		String a = "arp";
		char array[] = a.toCharArray();
		int max = 0;
		int index = 0;
		
		for(int i=0;i<array.length;i++) {
			int ascii = array[i] - 'a' + 1;
			if(ascii > max) {
				max = ascii;
				index = i;
			}
		}
		
		StringBuilder sb = new StringBuilder(a);
		sb.deleteCharAt(index);
		
		System.out.println("index "+index);
	}

}
