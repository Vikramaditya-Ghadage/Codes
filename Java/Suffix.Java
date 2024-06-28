import java.util.*;
public class MyClas
{

	public static void main(String[] args)
	{
		// Test case-sensitive implementation
		// of endsWith function
	Scanner sc = new Scanner(System.in);
    String[] A = new String[7];
    String[] B = new String[3];

    int C[]=new int[3];
    
    for (int i = 0; i < A.length; i++) {
                 A[i] = sc.nextLine();
    }
    
    for (int i = 0; i < B.length; i++) {
                 B[i] = sc.nextLine();
                 
    }
		  for (int i = 0; i < B.length; i++) {


                int cnt=0;
                for(int j = 0; j < A.length; j++)
                {
                    System.out.println(B[i]);
                    System.out.println(A[j]);
            		boolean result = A[j].endsWith(B[i]);
            
            		if (result)
            				cnt++;

                }
                C[i]=cnt;
		  }
		  
		  
		  for (int i = 0; i < C.length; i++) {
		      System.out.println(C[i]);
		  }
	}
}

// This code is contributed by 29AjayKumar
