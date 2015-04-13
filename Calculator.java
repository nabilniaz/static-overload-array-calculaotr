
public class Calculator {

	public static double getSum (double first, double second, double third){ // first method. does nothing
		return first+second+third;
	}

	public static double getSum (double [] num){ // overloaded method. 
			double sum =0;
		for (int i=0; i<num.length; i++){ // run the loop as long as i < how long the array was declared for. Which was 3
			
			sum += num[i]; // takes the sum of 3 nubmers
			
		
					
		}
		return sum; //  return the value
	}
	public static double getAverage (double first, double second, double third){ //first method. this doesnt do anyhitng
		return (first+second+third)/3;
	}

	public static double getAverage (double [] num){ //overloadd method
		double sum =0; double average;
		for (int i=0; i<num.length; i++){
			sum +=num[i];
		
		}
	average=sum/num.length; // average of sum
	return average;
	}
	
	public static double getProduct (double first, double second, double third){
		double product = first*second*third;
		return product;
	}
	public static double getProduct ( double [] num){
		double product=num[0]*num[1]*num[2];
		return product;
		
	}
	
	public static double getFactorial(int n) { 
		 double factorial = 1.0; 
		 for (int k=2; k<=n; ++k)  // will run the user input for as long as the value of the number they input
		 { factorial *= k; } // formula for factorial
		 return factorial; 
		} 
	}

	

