public class Reach
{
    public static boolean canReach(int []arr,int curr)
    {
        return dfs(arr,curr);
    }
    public static boolean dfs(int []arr,int curr)
    {
        int n=arr.length;
        int target=n-1;

        if(curr==target)
        return true;
        
        if(curr>target) return false;

        for(int jump=1;jump<=arr[curr] && curr+jump<n;jump++)
        {
            if(dfs(arr,curr+jump))
            {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,0};
        System.out.println(canReach(arr,0));
    }
}