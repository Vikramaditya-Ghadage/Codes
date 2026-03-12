import java.util.*;
public class Store
{
    Set<String> findMinStores(Set<String> orderItems, 
                           Map<String, Set<String>> 
						   storeInventory)
                           
    {
        HashSet<String> findaStore=new HashSet<>();
        while(!orderItems.isEmpty())
        {
            Set<String> Itemcoverd=new HashSet<String>();

            for(Map.Entry<String,Set<String>> st:storeInventory.entrySet())
            {
                Set<String> coverd=new HashSet<String>(st.getValue());
                Itemcoverd.retainAll(coverd);
                if(Itemcoverd.size()<coverd.size())
                {
                    findaStore.add(st.getKey());
                    Itemcoverd=coverd;
                }
            }
        }
        return findaStore;
    }
						   
    public static void main(String[] args) {
        
    }
}