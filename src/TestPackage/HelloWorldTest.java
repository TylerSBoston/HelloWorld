package TestPackage;

public class HelloWorldTest {

    public static void main(String[] args) {
    	
    	

    	
    	for(int i = 1; i<10; i++) // 9 hello worlds.....cause why not.
    	{
    		System.out.println(DoISayHi());
    	}
    }
    
    private static String DoISayHi()
    {
    	String yo = new String();
    	if(Math.random()<.5)
    		yo = "Hello World";
    	else
    		yo = "not saying it";
    	return yo;
    }
}
