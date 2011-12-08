
public class HelloWorld {

	public HelloWorld(){
		;
	}
	
	public void hello(String hej){
		System.out.println(hej);
	}
	
	public void call1(){
		call1();
	}
	
	public static void main(String args []){
		HelloWorld hej = new HelloWorld();
		hej.hello("Hej världen!");
		hej.call1();
		
	
	}
}


