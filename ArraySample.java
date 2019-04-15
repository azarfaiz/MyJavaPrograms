import java.util.Scanner;

public class ArraySample {
	
	public static void main(String[] args) {
		
		//int main[] = {101,52,95,77,26,889};
		int main[] = {3,2,7,6,5,1,2,3,4};
		//int subarray1[],subarray2[],subarray3[],subarray4[];
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the window size");
		int winsize = ip.nextInt();
		//int temp = winsize;
		int k,digit,desiredSubArray = 0;
		int numSubArray = main.length-winsize+1;
		//System.out.println("numsubarray "+numSubArray);
		int subarray[][] = new int[numSubArray][winsize];
		int subarraytemp[][] = new int[numSubArray][winsize];
		//subarray1 = Arrays.copyOfRange(main, 0, 3);
		/*subarray1 = Arrays.copyOfRange(main, j, temp);
		subarray2 = Arrays.copyOfRange(main, ++j, ++temp);
		subarray3 = Arrays.copyOfRange(main, ++j, ++temp);
		subarray4 = Arrays.copyOfRange(main, ++j, ++temp);*/
		for(int i=0;i<numSubArray;i++){
			k=i;
			for(int j=0;j<winsize;j++){
				subarray[i][j] = main[k];
				subarraytemp[i][j] = main[k];
				System.out.print(subarray[i][j]+" ");
				k++;
			}
			System.out.println();
		}
		int high;
		for(int i=0;i<numSubArray;i++){
			high = 0;
			for(int j=0;j<winsize;j++){
				if(high < subarray[i][j]){
					high = subarray[i][j];
				}
			}
			System.out.print(high+" ");
		}
		
		/*for(int i=0;i<numSubArray;i++){
			for(int j=0;j<winsize;j++){
				while(subarraytemp[i][j] > 0){
					digit = subarraytemp[i][j] % 10;
					if(digit == 8){
						desiredSubArray = i;
						//System.out.println("The sub array "+ i + " contains favourite number 8");
						System.out.println("Desired sub array "+desiredSubArray);
						break;
					}
					subarraytemp[i][j] = subarraytemp[i][j] / 10;
				}
			}
		}
		
		for(int i=0;i<winsize;i++){
			//System.out.println(subarray[desiredSubArray][i]);
			//int udigit = subarray[desiredSubArray][i] % 10;
			//System.out.println("udigit "+udigit);
			int hundreds = subarray[desiredSubArray][i] / 100;
			int tens = ((subarray[desiredSubArray][i] - hundreds) / 10) % 10;
			int ones = (subarray[desiredSubArray][i] % 10);
			System.out.println(hundreds+" "+tens+" "+ones);
		}*/
		
	}

}
