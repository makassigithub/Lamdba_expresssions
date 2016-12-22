package pack1;

public class TestClass {

	public static void main(String...args){
		
		// Reference to the funtional interface
		Value value;
		
		// This line of code implements the showValue() method in the interface
		//It creates a tight relationship between the interface and the lambda expression
		// the return their return types must be the same as well as the parameter list if they are
		value = ()->12.5;
		
		// value = ()->12.5; is similar to creating an anonymous class wit an anonymous method that implements the functional interface
		System.out.println(value.showValue());
		
	}
}
