package Projects;

public class ReverseString {

	public static void main(String[] args) {
		
		String myReversedName = reverseName("Sarah");
		System.out.println(myReversedName);
	}

	static String reverseName(String aName) {
		String reversedName = "";
		for(int i = aName.length()-1; i>=0; i--) {
			reversedName += aName.charAt(i);
		}
		return reversedName;
	}
}

