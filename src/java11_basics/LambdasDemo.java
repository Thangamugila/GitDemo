package java11_basics;

public class LambdasDemo {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Result is: " + doOperation(12, 4, "multiply"));
//	}
//	public static double doOperation(double num1, double num2, String operation) {
//		
//	    switch(operation) {
//	        case "add":
//	            return addCriteria(num1,num2);
//	        case "subtract":
//	            return subCriteria(num1,num2);
//	        case "multiply":
//	            return mulCriteria(num1,num2);
//	        default:
//	            //Considering there are no wrong inputs, the default case is for operation=="divide"
//	            return divCriteria(num1,num2);
//	    }
//	    	
//	}
//	//Method for Addition
//	public static double addCriteria(double firstNum, double secondNum) {
//		double result = firstNum + secondNum;
//		return result;
//	}
//	//Method for Subtraction	
//	public static double subCriteria(double firstNum, double secondNum) {
//		double result = firstNum - secondNum;
//		return result;
//	}
//	//Method for Multiplication
//	public static double mulCriteria(double firstNum, double secondNum) {
//		double result = firstNum * secondNum;
//		return result;
//	}
//	//Method for Division
//	public static double divCriteria(double firstNum, double secondNum) {
//		double result = firstNum / secondNum;
//		return result;
//	}
	public static double doOperation(double num1, double num2, Operation operation) {
		return operation.calculations(num1,num2);
	}
// actual lambda expression
	
	
	    public static void main(String[] args) {
	    	
	    	//creating lambda expression
	        Operation adder =  (double x, double y)-> x + y;      //Line 2
	        Operation subtractor=(double x,double y)->x-y;
	        //executing lambda expression
	        double result = adder.calculations(5, 6);  //Line 3
	        double subResult=subtractor.calculations(11, 7);
	        
	        System.out.println(result);               
	        System.out.println(subResult);   
	        System.out.println(doOperation(12,4,adder));


	        

	    }
	}



