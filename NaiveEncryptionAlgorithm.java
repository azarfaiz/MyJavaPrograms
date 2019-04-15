import java.util.Scanner;

public class NaiveEncryptionAlgorithm {
	
	static int R = 0,C = 0;

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String input;
		String data = null;
		System.out.println("Enter the rows columns and data to be encrypted");
		input = ip.nextLine();
		String inputArray[] = new String[3];
		inputArray = input.split(" ");
		int rLen = 0,cLen = 0;
		for(int i = 0;i<inputArray.length;i++){
			if(i == 0){
				R = Integer.parseInt(inputArray[i]);
				rLen = inputArray[i].length();
			}
			else if(i == 1){
				C = Integer.parseInt(inputArray[i]);
				cLen = inputArray[i].length();
			}
		}
		data = input.substring(rLen+cLen+2);
		char dataArray[] = data.toCharArray();
		StringBuilder binary = new StringBuilder();
		for(int i = 0;i<dataArray.length;i++){
			int decimal = decimalEquivalent(dataArray[i]);
			binary = binary.append(binaryEquivalent(decimal));
		}
		char result[] = binary.toString().toCharArray();
		spiralPrinting(result);
		ip.close();
	}
	
	public static int decimalEquivalent(char c){
		if(c == ' ')
			return 0;
		int dec = 0;
		dec = c - 'A' + 1;
		return dec;
	}
	
	public static StringBuilder binaryEquivalent(int number){
		StringBuilder sb = new StringBuilder();
		
		while(number > 0){
			int rem = number % 2;
			sb.append(rem);
			number = number / 2;
		}
		while(sb.length() < 5){
			sb.append(0);
		}
		return sb.reverse();
	}
	
	public static void spiralPrinting(char encryptedArray[]){
		int Top=0,Bottom=R-1,Left=0,Right=C-1,dir=0;
		char resultMatrix[][] = new char[R][C];
		int j =0;
		while(Top<=Bottom && Left<=Right){
			if(j >= encryptedArray.length)
				break;
			if(dir==0){
				for(int i=Top;i<=Right;i++){
					if(j < encryptedArray.length){
						resultMatrix[Top][i] = encryptedArray[j++];
					}
					/*else{
						resultMatrix[Top][i] = '0';
					}*/
				}
				Top++;
				dir = (dir+1)%4;
			}
			
			else if(dir==1){
				for(int i=Top;i<=Bottom;i++){
					if(j < encryptedArray.length){
						resultMatrix[i][Right] = encryptedArray[j++];
					}
					/*else{
						resultMatrix[i][Right] = '0';
					}*/
				}
				Right--;
				dir = (dir+1)%4;
			}
			
			else if(dir==2){
				for(int i=Right;i>=Left;i--){
					if(j < encryptedArray.length){
						resultMatrix[Bottom][i] = encryptedArray[j++];
					}
					/*else{
						resultMatrix[Bottom][i] = '0';
					}*/
				}
				Bottom--;
				dir = (dir+1)%4;
			}
			
			else if(dir==3){
				for(int i=Bottom;i>=Top;i--){
					if(j < encryptedArray.length){
						resultMatrix[i][Left] = encryptedArray[j++];
					}
					/*else{
						resultMatrix[i][Left] = '0';
					}*/
				}
				Left++;
				dir = (dir+1)%4;
			}
			
		}
		
		for(int i=0;i<R;i++){
			for(int k=0;k<C;k++){
				System.out.print(resultMatrix[i][k]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<R;i++){
			for(int k=0;k<C;k++){
				if(resultMatrix[i][k] == 0)
					System.out.print(0);
				else
					System.out.print(resultMatrix[i][k]);
			}
		}
		
	}
}
