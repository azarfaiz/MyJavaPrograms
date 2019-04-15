import java.util.Stack;

//Completely Remove the elements that are repeated in an array using Stack 
//I/P: abbccaddeef
//O/P: f
public class NewStack {
	
	public static void main(String args[]){
	
		Stack<Character> st = new Stack<Character>();
		char a[] = {'a','b','b','c','c','c','c','e','e'};
		//System.out.println("1 "+st.empty());
		for(int i=0;i<a.length;i++){
			if(st.isEmpty()){
				st.push(a[i]);
			}
			else{
				if(st.peek() != a[i]){
					st.push(a[i]);
				}
				else{
					int count = 0;
					while(st.peek() == a[i]){
						count++;
						if(i+1 < a.length && a[i] == a[i+1]){
							i++;
						}
						else
							break;
					}
					if(count !=0)
						st.pop();
				}
			}
		}
		System.out.println("Stack------->"+st);
	}
	
}
