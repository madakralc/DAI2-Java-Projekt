
public class HelloWorld {

	public HelloWorld(){
		;
	}
	
	public void hello(String hej){
		System.out.println(hej);
	}
	
	public static void main(String args []){
		HelloWorld hej = new HelloWorld();
		hej.hello("Hej världen!");
	}
}


