import java.util.Scanner;

public class StringSwap {

	private static Scanner ip;

	public static void main(String[] args) {
		/*String a = "iamazar";
		String b = "faiz";
		a = a+b;
		b = a.substring(0,(a.length() - b.length()));
		a = a.substring(b.length(),a.length());
		System.out.println("String a after swap is "+a);
		System.out.println("String b after swap is "+b);*/
		
		/*StringBuffer sb = new StringBuffer("zohozohozohozohohdzogozoho");
		int after = 0;
		int flag = 0;
		int count = 0;
		while(flag == 0){
			int initial = sb.length();
			//System.out.println("Inital"+initial);
			for(int i=0;i<sb.length();i++){
				if(i<=sb.length()-4){
					if(sb.substring(i, i+4).equalsIgnoreCase("zoho")){
						sb.delete(i, i+4);
						count++;
						after = sb.length();
					}
				}
			}
			//System.out.println(sb);
			//System.out.println("after"+after);
			if(initial == after){
				flag = 1;
			}
		}
		if(sb.length() ==0){
			System.out.println("cleared "+count);
		}
		else{
			System.out.println(sb);
		}*/
		
		String line = "dhoni is the best captain of Indian cricket team";
		String words[] = line.split("\\s");
		String finalwords[] = new String[words.length];
		ip = new Scanner(System.in);
		System.out.println("Enter the user input from which string need to be reversed");
		String input2 = ip.nextLine();
		int countword = words.length;
		int wordposition = 0;
		//System.out.println(countword);
		for(int i =0;i<words.length;i++){
			if(words[i].equalsIgnoreCase(input2)){
				wordposition = i;
				break;
			}
		}
		//System.out.println(wordposition);
		
		for(int i=countword-1;i>=0;i--){
			//System.out.println("wordposition "+wordposition);
			//System.out.println("i "+i);
			if(wordposition != countword){
				finalwords[i] = words[wordposition++];
			}
			else{
				finalwords[i] = words[i];
			}
		}
		
		for(int i =0;i<finalwords.length;i++){
			System.out.print(finalwords[i]+" ");
		}
	}

}
