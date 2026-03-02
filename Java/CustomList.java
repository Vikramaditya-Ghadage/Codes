import java.util.Arrays;

class MyList<T>
{
	private int size=8;
	private Object [] list;
	private int counter=0;
	
	MyList()
	{	
		list=new Object[size];
	}
	
	public void add(T ele)
	{
		if(counter>=size)
		increseSize();
		list[counter++]=ele;
	}
	
	public void increseSize()
	{
		size=(size*2);
		list=Arrays.copyOf(list,size);
	}
	
	public void print()
	{
		for(int i=0;i<counter;i++)
		System.out.println(list[i]);
	}
	

}

class CustomList
{
	public static void main(String args[])
	{
		MyList<String> l1=new MyList<String>();	
			l1.add("hello");
			l1.add("hi");
			l1.add("how");
			
			l1.print();
	
	}

}