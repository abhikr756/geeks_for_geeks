class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    Arrays.sort(a);
	    ArrayList<Integer> hlist =new ArrayList<>();
	    for(int i=0;i<a.length;i++)
	    {
	        if(!hlist.contains(a[i]))
	        {
	           hlist.add(a[i]); 
	        }
	    }
	   if(hlist.size()<=2)
	   {
	      return -1; 
	   }
	   else if(hlist.size()==3)
	   {
	       return hlist.get(2);
	   }
	    return hlist.get(hlist.size()-3);
    }
}
