
//Find the missing number in the array sequence
public class MissingNumberInSequence {
	public static void main(String args[]){
		int a[] = {4,2,8,6,5,3};
		int sum=0;
		int seqSum = 0;
		int min,max;
		for(int i=0;i<a.length;i++){
			sum = sum+a[i];
		}
		min = a[0];
		max = a[0];
		for(int i=1;i<a.length;i++){
			if(a[i] < min){
				min = a[i];
			}
			if(a[i] > max){
				max = a[i];
			}
		}
		
		for(int i=min;i<=max;i++){
			seqSum = seqSum + i;
		}
		System.out.println("Missing number in the sequence is "+(seqSum-sum));
	}
}
