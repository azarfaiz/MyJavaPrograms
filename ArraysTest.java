import java.util.*;

public class ArraysTest {

	public static void main(String[] args) {
		
		//Find the count of elements with atleast two bigger elements than them
		
		int a[] = {1,1,1,2,2,2,2,4,5,6,6,7,7,8,8,8};
		int res = a.length - 2,i=0,count;
		Arrays.sort(a);
		for(i=0;i<a.length-1;i++){
			count = 0;
			while( i!= a.length-1 && a[i] == a[i+1]){
				count++;
				i++;
			}
			res = res - count;
		}
		System.out.println("Output is "+res);
		
		//Alternative to above program using TreeSet
		int b[] = {7,2,5,1,4,2,5,6,8,7,8,1,2,5,6,7,8};
		TreeSet<Integer> ts = new TreeSet<>();
		for(int j:b) {
			ts.add(j);
		}
		
		int answer = ts.size() - 2;
		System.out.println(answer);
		
		//Displaying the element and its count of occurrence
		HashMap<Integer,Integer> map = new HashMap<>();
		//LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int j:b) {
			if(map.get(j) != null) {
				map.put(j,map.get(j)+1);
			}
			else {
				map.put(j,1);
			}
		}
		
		System.out.println(map);
		
		
		//PRINT WITHOUT DUPLICATE ELEMENTS
		/*int a[] = {1,1,1,2,2,2,2,4,5,6,6,7,7,8,8,9};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			while( i!= a.length-1 && a[i] == a[i+1]){
				i++;
			}
			System.out.print(a[i]+" ");
		}*/
		
		
		
		//Lucky numbers series 4,7,44,47,74,77....
		
		/*Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = ip.nextInt();
		
		System.out.println("Value is "+getResult(n));
		
	}
	
	public static int getResult(int n){
		int a[] = new int[n+1];
		a[1] = 4;
		a[2] = 7;
		for(int i=3;i<=n;i++){
			if(i % 2 != 0){
				a[i] = a[i/2] * 10 + 4;
			}
			else{
				a[i] = a[(i/2)-1] * 10 + 7;
			}
		}
		return a[n];*/
		
		
		//Longest consecutive numbers
		
		/*int n;
		int a[]={1,7,8,2,4,3,6,9,10,11};
		n=a.length;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n=ip.nextInt();
		a=new int[n];
		int res = 0;
		int lastNumber = 0;
		HashSet<Integer> b= new HashSet<Integer>();
		//System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			b.add(a[i]);
		}
		
		for(int i=0;i<n;i++){
			int count = 0;
			if(!b.contains(a[i]-1)){
				int j = a[i];
				while(b.contains(j)){
					count++;
					j++;
				}
				if(res < (j-a[i])){
					res = j-a[i];
					lastNumber = j-1;
				}
				
			}
			
		}
		int firstNumber = (lastNumber - res)+1;
		while(res > 0){
			System.out.print(firstNumber+" ");
			firstNumber++;
			res--;
		}*/
		
		//Numbers occurring odd times
		
		/*int ar[] = {2,3,5,4,5,2,4,3,5,2,4,4,2,5,5,4,4};
		int n = ar.length;
		System.out.println(getOddOccurrence(ar,n));
		
		
	}
	
	static int getOddOccurrence(int ar[],int n){
		int i;
		int res = 0;
		for(i=0;i<n;i++){
			System.out.print(res+" ^ "+ar[i]);
			res = res ^ ar[i];
			System.out.println(" Res----> "+res);
		}
		return res;
		 				*/
		
		//maximum of three numbers
		/*int a,b,c;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the numbers one by one");
		a = ip.nextInt();
		b = ip.nextInt();
		c = ip.nextInt();
		if(a > b){
			if(a > c){
				System.out.println(a+" is the biggest number");
			}
			else{
				System.out.println(c+" is the biggest number");
			}
		}
		else if(b > a){
			if(b > c){
				System.out.println(b+" is the biggest number");
			}
			else{
				System.out.println(c+" is the biggest number");
			}
		}
		else{
			System.out.println("No bigger number");
		}*/
	}
	
}
