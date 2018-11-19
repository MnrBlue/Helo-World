//A simple calculator that can perform addition, subtraction, multiplication, division and remainder of two integers.
public class Calculator{
	Calculator(){
		
	}
	public int add(int a, int b){
		return a + b;
	}
	public int subtract(int a, int b){
		return a - b;
	}
	public int multiply(int a, int b){
		return a * b;
	}
	public int divide(int a, int b){
		if (b == 0){
			System.out.println("Error! Dividing by zero is not allowed!);
			return 0;
		}
		else{
			return a / b;
		}
	}
	public int modulo(int a, int b){
		if (b == 0){
			System.out.println("Error! Dividing by zero is not allowed!);
			return 0;
		}
		else{
			return a % b;
		}
	}
	public static void main(String[] args){
		Calculator myCalculator = new Calculator();
		System.out.println(myCalcualtor.add(5,7));
		System.out.println(myCalcualtor.subtract(45,11));
	}
}