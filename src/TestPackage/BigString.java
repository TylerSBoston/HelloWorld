package TestPackage;

import java.util.*;
public class BigString {

	
	private String InputString = new String();
	// there is better place to put these hardcoded values but its here do to project scale.
	private static String[] H = new String[]  {"  ///      ///  ",
										"  ///      ///  ",
										"  ///      ///  ",
										"  ////////////  ",
										"  ////////////  ",
										"  ///      ///  ",
										"  ///      ///  ",
										"  ///      ///  "};
	
	private static String[] E = new String[]  {"  ////////////  ",
										"  ////////////  ",
										"  ///           ",
										"  ////////////  ",
										"  ////////////  ",
										"  ///           ",
										"  ////////////  ",
										"  ////////////  "};
	
	private static  String[] L = new String[]  {"  ///           ",
										"  ///           ",
										"  ///           ",
										"  ///           ",
										"  ///           ",
										"  ///           ",
										"  ////////////  ",
										"  ////////////  "};
	
	private static  String[] LetterO = new String[]  {	"     //\\\\     ",
														"    ///\\\\\\    ",
														"   ///  \\\\\\   ",
														"  ///    \\\\\\  ",
														"  \\\\\\    ///  ",
														"   \\\\\\  ///   ",
														"    \\\\\\///    ",
											  			"     \\\\//     "};
	
	private  static String[] W = new String[]  {"  ///      ////     ///  ",
										"  ///     /////     ///  ",
										"   ///   //////    ///   ",
										"   ///   /// ///   ///   ",
										"    /// ///  ///  ///    ",
										"    /// ///   /// ///    ",
										"    //////    //////     ",
										"    /////     /////      "};
	
	private static String[] R = new String[]  {"  ///////////    ",
										"  ////////////   ",
										"  ///      ////  ",
										"  ///      ////  ",
										"  ///////////    ",
										"  ///     ///    ",
										"  ///      ///   ",
										"  ///       ///  "};
	
	private static String[] D = new String[]  {"  ///////////    ",
										"  ////////////   ",
										"  ///      ////  ",
										"  ///        /// ",
										"  ///        /// ",
										"  ///      ////  ",
										"  ////////////   ",
										"  ///////////    "};
	
	private  static String[] Space = new String[]  {"         ",
											"         ",
											"         ",
											"         ",
											"         ",
											"         ",
											"         ",
											"         "};
	
	
	private Map<String, BigChar> BigCharHolder = new HashMap<String, BigChar>();
	
	
	//requires caps, only takes remade inputs, didn't put the ASCII lower to upper case transition
	public BigString(String input)
	{
		InputString = input;
		
		BigCharHolder.put("H",new BigChar(H));
		BigCharHolder.put("L",new BigChar(L));
		BigCharHolder.put("O",new BigChar(LetterO));
		BigCharHolder.put("E",new BigChar(E));
		BigCharHolder.put("W",new BigChar(W));
		BigCharHolder.put("R",new BigChar(R));
		BigCharHolder.put("D",new BigChar(D));
		BigCharHolder.put(" ",new BigChar(Space));
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
