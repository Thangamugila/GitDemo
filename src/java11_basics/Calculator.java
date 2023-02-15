package java11_basics;

//Defining functional interface
@FunctionalInterface
interface Calculator{
	
	//defining abstract method
	int doOperation(int num1, int num2);
	
	//defining default method
	default boolean checkValues(int num1, int num2) {
		return (num1>0 && num2>0);
	}
}


