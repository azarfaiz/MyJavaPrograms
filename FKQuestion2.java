
public class FKQuestion2 {

	public static void main(String[] args) {
		
		int a[] = {2,5,7,2,4};
		int maxUnit = 0;
		int min = 0;
		int multiplier = 3;
		
		for(int i=0;i<3;i++) {
			if(a[i] < a[a.length-1]) {
				min = a[i] * multiplier;
			}
			else {
				min = a[a.length-1] * multiplier;
			}
			
			if(min > maxUnit) {
				maxUnit = min;
			}
			multiplier--;
		}
		
		System.out.println("Max unit that can be filled is : "+ maxUnit);

	}

}
