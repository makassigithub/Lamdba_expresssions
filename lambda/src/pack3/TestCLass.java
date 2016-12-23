package pack3;

public class TestCLass {
    // implementation 
	// whether we specify the type of both params or we leave it. It,a inferred from the target type
	 
	  
	  public static void main(String...args){
		  
		  MultipleParamLambda exp = (m,n)-> (m.length()>n.length());
		  
		  System.out.println(exp.getit("Brahima","Traore"));
	  }
			                                                    
	// During implementation, one param signature can we enclosed within brakets nor.		                          
			
	
}
