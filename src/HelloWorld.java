
public class HelloWorld {
	static int key = 123;
	static int crypt;
	
	public HelloWorld(){
		;
	}
	
	public void hello(String hej){
		System.out.println(hej);
	}
	
	public int encrypt(int key){
		crypt = key + 1;
		return crypt;
	}
	
	
	public void decrypt(int crypt){
		int pass = crypt - 1;
		System.out.println(pass);
	}
	
	public static void main(String args []){
		HelloWorld hej = new HelloWorld();
		hej.hello("Hej världen!");
		hej.encrypt(key);
		hej.decrypt(crypt);
		
	
	}
}


