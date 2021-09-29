package TesTing;

public class Calculator {
	public static int add(int value1,int value2) {
		return value1+value2;
	}
	public static int sub(int value1,int value2) {
		return value1-value2;

}
	
	public static int mul(int value1,int value2) {
		return value1*value2;

}
	public static double div(double value1,double value2) {
		if(value2==0){
			throw new IllegalArgumentException("Number can not be divide by 0;");
		}
		return value1/value2;

}
	
}
	