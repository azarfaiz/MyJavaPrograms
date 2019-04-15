
public class MergeSort {

	public static void main(String[] args) {
		
		int mainArray[] = {25,24,01,56,48,35,13,17};
		mainArray = divideArray(mainArray);
		  for(int p=0;p<mainArray.length;p++){
		    	System.out.print(mainArray[p]+" ");
		    }
		    
	}
	
	private static int[] divideArray(int A[]){
		int size = A.length;
		if(size<2){
			return A;
		}
		int mid = size/2;
		//System.out.println("Size of main array "+size);
		//System.out.println("mid is "+mid);
		int leftArray[] = new int[mid];
		int rightArray[] = new int[size-mid];
		
		for(int i=0;i<mid;i++){
			leftArray[i] = A[i];
			//System.out.println("Left array position "+i+"is "+leftArray[i]);
		}
		
		for(int i=0;i<(size-mid);i++){
			rightArray[i] = A[mid+i];
			//System.out.println("Right array position "+i+"is "+rightArray[i]);
		}
		divideArray(leftArray);
		divideArray(rightArray);
		A=mergeSorting(leftArray, rightArray,A);
		return A;
	}
	
	private static int[] mergeSorting(int left[],int right[],int main[]){
		int leftLength = left.length;
		int rightLength = right.length;
		int i=0,j=0,k=0;
		while(j<leftLength && k<rightLength){
			if(left[j]<=right[k]){
				main[i] = left[j];
				i++;
				j++;
			}
			else if(left[j]>right[k]){
				main[i] = right[k];
				i++;
				k++;
			}
		}
	    while(j<leftLength){
	    	main[i] = left[j];
	    	i++;
	    	j++;
	    }
	    while(k<rightLength){
	    	main[i] = right[k];
	    	i++;
	    	k++;
	    }
	    return main;
	  
	}

}
