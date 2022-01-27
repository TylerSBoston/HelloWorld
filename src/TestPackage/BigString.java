package TestPackage;

import java.util.*;
public class BigString {

	
	private String InputString = new String();	
	
	private Map<String, BigChar> BigCharHolder = new HashMap<String, BigChar>();
	
	
	//requires caps, only takes remade inputs, didn't put the ASCII lower to upper case transition
	public BigString(String input)
	{
		InputString = input;
		
		BigCharHolder.put("H",new BigChar(new String[]  {"  ///      ///  ",
				"  ///      ///  ",
				"  ///      ///  ",
				"  ////////////  ",
				"  ////////////  ",
				"  ///      ///  ",
				"  ///      ///  ",
				"  ///      ///  "}));
		BigCharHolder.put("L",new BigChar(new String[]  {"  ///           ",
				"  ///           ",
				"  ///           ",
				"  ///           ",
				"  ///           ",
				"  ///           ",
				"  ////////////  ",
				"  ////////////  "}));
		BigCharHolder.put("O",new BigChar(new String[]  {	"     //\\\\     ",
				"    ///\\\\\\    ",
				"   ///  \\\\\\   ",
				"  ///    \\\\\\  ",
				"  \\\\\\    ///  ",
				"   \\\\\\  ///   ",
				"    \\\\\\///    ",
	  			"     \\\\//     "}));
		BigCharHolder.put("E",new BigChar(new String[]  {"  ////////////  ",
				"  ////////////  ",
				"  ///           ",
				"  ////////////  ",
				"  ////////////  ",
				"  ///           ",
				"  ////////////  ",
				"  ////////////  "}));
		BigCharHolder.put("W",new BigChar(new String[]  {"  ///      ////     ///  ",
			"  ///     /////     ///  ",
			"   ///   //////    ///   ",
			"   ///   /// ///   ///   ",
			"    /// ///  ///  ///    ",
			"    /// ///   /// ///    ",
			"    //////    //////     ",
			"    /////     /////      "}));
		BigCharHolder.put("R",new BigChar(new String[]  {"  ///////////    ",
				"  ////////////   ",
				"  ///      ////  ",
				"  ///      ////  ",
				"  ///////////    ",
				"  ///     ///    ",
				"  ///      ///   ",
				"  ///       ///  "}));
		BigCharHolder.put("D",new BigChar(new String[]  {"  ///////////    ",
				"  ////////////   ",
				"  ///      ////  ",
				"  ///        /// ",
				"  ///        /// ",
				"  ///      ////  ",
				"  ////////////   ",
				"  ///////////    "}));
		BigCharHolder.put(" ",new BigChar(new String[]  {"         ",
				"         ",
				"         ",
				"         ",
				"         ",
				"         ",
				"         ",
				"         "}));
	}
	
	
	
	public void PrintBigSpring()
	{
		for(int i = 0; i<8;i++ )
		{
			for(int j = 0; j<InputString.length();j++)
			{
				System.out.print(BigCharHolder.get(String.valueOf(InputString.charAt(j))).PullLine(i));	
				
			}
			System.out.println();
		}
		
		
	}
	
	

	
	
	
	
}
