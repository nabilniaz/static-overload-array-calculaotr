//were going to make a calculator using arrays/static methods/ and overloads
// a overload is when a second method has the same name as the first, but different paramters
// a array is a group of variables with the same data type
// declaring a static method allows you to call it without instanting it(Creating a object)
public class CalculatorDriver {

	public static void main(String[] args) {
		double num [] = new double[3];
		System.out.println(Calculator.getSum(10,3,5));
		System.out.println(Calculator.getAverage(5,8,3));
		System.out.println(Calculator.getFactorial(5));

	}

}
