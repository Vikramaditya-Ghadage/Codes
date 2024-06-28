import java.util.*;

class Stack_String{

// Function to print Strings present
// between any pair of delimiters
static void printSubsInDelimiters(String str)
{
	// Stores the indices of
	Stack<Integer> dels = new Stack<Integer>();
	for(int i = 0; i < str.length(); i++)
	{
		// If opening delimiter
		// is encountered
		if (str.charAt(i) == '(')
		{
			dels.add(i);
		}

		// If closing delimiter
		// is encountered
		else if (str.charAt(i) == ')' &&
				!dels.isEmpty())
		{			
			// Extract the position
			// of opening delimiter
			int pos = dels.peek();

			dels.pop();

			// Length of subString
			int len = i - 1 - pos;

			// Extract the subString
			String ans = str.substring(
				pos + 1, pos + 1 + len);

			System.out.print(ans + "\n");
		}
	}
}

// Driver Code
public static void main(String[] args)
{
	String str = "(This is first) ignored text (This is second)";

	printSubsInDelimiters(str);
}
}

