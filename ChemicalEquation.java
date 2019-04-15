import java.util.Stack;

public class ChemicalEquation {

	//h(h2o)3h2no3 --> hhhohhohhohhnooo
	//h(h(h2o)2)3co --> h hhhohho hhhohho hhhohho co
	//h(h(h2o)2)3co3 --> h hhhohho hhhohho hhhohho cooo
	
	public static void main(String args[]){
		String equation = "h(h2o)3h2no3";
		char ch[] = equation.toCharArray();
		Stack st = new Stack();
		for(int i=0;i<ch.length;i++){
			
			int smallIterator = 0;
			char smallIteratorChar = ' ';
			int a = i;
			if(Character.isAlphabetic(ch[i]) && i+1 < ch.length && Character.isDigit(ch[i+1])){
				while(i+1 < equation.length() && Character.isDigit(ch[i+1])){
					smallIteratorChar = ch[a];
					smallIterator*=10;
					smallIterator = smallIterator + (ch[i+1] - '0');
					i++;
				}
				StringBuilder smallIteratorSb =  iterateChar(smallIteratorChar,smallIterator);
				for(int index=0;index<smallIteratorSb.length();index++){
					st.push(smallIteratorSb.charAt(index));
				}
			}
			
			else{
				st.push(ch[i]);
			}
			
			if(ch[i] == ')'){
				int iteratorCount = 0;
				while(i+1 < equation.length() && Character.isDigit(ch[i+1])){
					iteratorCount*=10;
					iteratorCount =  iteratorCount + (ch[i+1] - '0');
					i++;
				}
				System.out.println("iteratorCount--------->"+iteratorCount);
				StringBuilder sb = new StringBuilder();
				while(true){
					char c = (Character) st.pop();
					sb.append(c);
					if(c == '('){
						sb.reverse();
						sb.replace(0,1,"");
						sb.replace(sb.length()-1,sb.length(),"");
						break;
					}
				}
				System.out.println("sb :"+sb);
				String newString = "";
				for(int k=0;k<iteratorCount;k++){
					newString = newString + sb;
				}
				for(int j=0;j<newString.length();j++){
					st.push(newString.charAt(j));
				}
			}
		}
		System.out.println("stack "+st);
		System.out.println("final--->"+st.toString());
	}
	
	/*public static StringBuilder printSequence(StringBuilder s){
		//h2o
		char charSeq[];
		StringBuilder expandedString = new StringBuilder();
		charSeq = s.toString().toCharArray();
		char multipleChar = ' ';
		int loopCount = 0;
		for(int i=0;i<charSeq.length;i++){
			if(Character.isAlphabetic(charSeq[i]) && i+1 < charSeq.length && Character.isAlphabetic(charSeq[i+1])){
				expandedString.append(charSeq[i]);
			}
			else if(i+1 < charSeq.length && Character.isDigit(charSeq[i+1])){
				while(i+1 < charSeq.length && Character.isDigit(charSeq[i+1])){
					multipleChar = charSeq[i];
					loopCount*=10;
					loopCount =  loopCount + (charSeq[i+1] - '0');
					i++;
				}
				System.out.println("loopcount------------>"+loopCount);
				expandedString.append(iterateChar(multipleChar,loopCount));
			}
			else{
				expandedString.append(charSeq[i]);
			}
		}
		return expandedString;
	}*/
	
	public static StringBuilder iterateChar(char a,int count){
		StringBuilder sbb = new StringBuilder();
		for(int j=0;j<count;j++){
			sbb.append(a);
		}
		return sbb;
	}
	
}
