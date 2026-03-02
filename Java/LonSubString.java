import java.util.*;
public class LonSubString {
    public static void main(String[] args) {
    List<List<Integer>> input=new ArrayList<>();
    input.add(new ArrayList<>(Arrays.asList(1,3)));
    input.add(new ArrayList<>(Arrays.asList(4,6)));
    input.add(new ArrayList<>(Arrays.asList(3,10)));
    input.add(new ArrayList<>(Arrays.asList(15,18)));
    
    int n=input.size();
    Collections.sort(input,(a,b)-> a.get(0)-b.get(0));

    for(int i=0;i<input.size();i++)
        System.out.println(input.get(i));

    List<List<Integer>> tmp=new ArrayList<>();
    tmp.add(new ArrayList<>(input.get(0)));
    for(int i=1;i<n;i++)
    {
        if(tmp.get(tmp.size()-1).get(1)<input.get(i).get(0))
        {
            tmp.add(new ArrayList<>(input.get(i)));
        }
        else
        {
            tmp.get(tmp.size()-1).set(1,Math.max(tmp.get(tmp.size()-1).get(1),input.get(i).get(1)));
        }
    }

        // for(int i=0;i<tmp.size();i++)
        // System.out.println(tmp.get(i));




    }
}
