package TestPackage;

public class BigChar {
	//
	private String[] bigLetter = new String[8];
	// should be recreation of a letter in 8 lines, such as
	/*   ///      ///
	 *   ///      ///
	 *   ///      ///
	 *	 //////////// 
	 *   //////////// 
	 *   ///      ///
	 *   ///      ///
	 *   ///      ///
	 */
	 
	// takes each line for the character
	public BigChar(String[] imputLetter)
	{
		for(int i = 0; i<8; i++)
		{
			bigLetter[i] = imputLetter[i];
		}
	}
	// pulls specific lines on call
	public String PullLine(int LineNumber)
	{
		return bigLetter[LineNumber];
	}
}
