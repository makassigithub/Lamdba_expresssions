package pack2;

public class TestClass {
    public static void main (String...args){
    	
    // implement the interface by defining the lambda expression 
    	
    	LambdaWithOneParm exp = (n)->(n>10); // or n->(n>10)
    // Another implementation that much the methods signature is possible
    	LambdaWithOneParm exp1 = (n)->(n%2)==0;
    	
    // let,s test both implementations
    	
    	int x = 3;
    	if(!exp.myMethod(x)){
    		System.out.println("x is not greater than 10");
    	 }else{System.out.println("x is greater than 10"); 
    	 };
    	 
    	 if(exp1.myMethod(x)){
     		System.out.println("x is even ");
    	 }else {
    		 System.out.println("x is not even ");
    	 }
     	 
    	/*Output
    	x is not greater than 10
        x is not even */
    	
    	
    }
}
