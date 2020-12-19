
public class CircleArea {
	public static double calcArea(int r) {
		return ( Math.pow( r, 2 ) * Math.PI );
	}
	
	public static void main(String [] Args) {
		System.out.println(calcArea(3));
	}
}
