import java.util.*;
class CustomList
{
    int arr[]=new int[5];
    static int cnt=0;
    public void add(int no)
    {

        if(cnt==arr.length-2)
        {
            //System.out.println(cnt+"\t"+arr.length);
            int new_size=arr.length+2;
          //  System.out.println("Array size resized to:"+new_size);
            int temp[]=new int[arr.length];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr=new int[new_size];
            System.arraycopy(temp, 0, arr, 0, temp.length);
        }

        arr[cnt++]=no;
        
    }
    public void addIndex(int index,int no)
    {
        if(index>cnt)
        {
            int new_size=index+2;
            int temp[]=new int[arr.length];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr=new int[new_size];
            System.arraycopy(temp, 0, arr, 0, temp.length);
            cnt=index;
            

        }
        arr[index]=no;
   
        
    }

    public void printArray()
    {
        for(int i=0;i<cnt;i++)
        System.out.println(arr[i]);
    }

    

}

class t3
{
    public static void main(String args[])
    {
        CustomList obj1=new CustomList();
        obj1.add(10);
        obj1.add(20);
        obj1.add(30);
        obj1.add(40);     
        obj1.add(50);

        obj1.add(60);
        obj1.add(70);    

        obj1.addIndex(1,90); 
        obj1.addIndex(10,900);

        obj1.add(100);
        obj1.addIndex(9,800);
 
        obj1.printArray();
    }
}