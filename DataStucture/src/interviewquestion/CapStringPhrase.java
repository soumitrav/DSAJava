package interviewquestion;

public class CapStringPhrase {

	public static String capVal(String str) {
		StringBuilder strB = new StringBuilder();
		
		for(String s : str.split(" ")) {
			strB.append(s.substring(0,1).toUpperCase()).append(s.substring(1));
			strB.append(" ");
		}
		return strB.toString();
	}
	public static void main(String []args) {
		System.out.println(capVal("my Name is soumitra"));
	}
}
