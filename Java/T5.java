import java.util.ArrayList;

class T5
{
    public static void main(String []args)
    {
        ArrayList<Integer> intList = new ArrayList<Integer>(15);
		for(int i=0;i<5;i++) {
			intList.add(i);
		}
		System.out.println(" list size == "+intList.size());  // 5
		for(int i=0;i<5;i++) {
			intList.remove(i);   
		}
		System.out.println(" my latest list == "+intList.size()); 
    }
}

//5241udtcsbraqp