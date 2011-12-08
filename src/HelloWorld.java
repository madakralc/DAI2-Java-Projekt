import java.util.HashMap;

public class HelloWorld {
	static int key = 123;
	static int crypt;
	
	private HashMap<String, String> hm;
	
	public HelloWorld(){
		hm = new HashMap<String, String>();
	}

	public void hello(String hej){
		System.out.println(hej);
	}
	
	public int encrypt(int key){
		crypt = key + 1;
		System.out.println("Your encrypted value is: " + crypt );
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
		
		//Test att printa ut random hej-medelande.
		
	}
}


