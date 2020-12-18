
public class PowerFunction {

	public static void main(String[] args) {
		
		System.out.println(pow(3,3));

	}
	
	
	static int pow(int a, int b) {
		int result = 1;
		
		for(int i = 0; i<b; i++) {
			result = result * a;
		}
		
		return result;
	}

}
