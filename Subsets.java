import java.util.*; 

class Solution {
	
	public static void main(String[] args) {
		double n = 2;
		double x = 9;
		int border = (int)Math.pow(x,1/n);
		int []ar = new int[border];
		
		for (int i = 1; i <= border; i++) {
			ar[i-1] = i;
		}
		System.out.println(subsets(ar).toString());
	}
	
	
   public static List<List<Integer>> subsets(int ar[]){
	   List<List<Integer>> res = new ArrayList<>();
	   subSets(res,new ArrayList<Integer>(),ar, 0);
	   return res;
   }   
   static void subSets(List<List<Integer>> res,List<Integer> temp,int[] ar, int p ) {
	   if(temp.size()>ar.length) return;
	   res.add(new ArrayList<>(temp));
	   for (int i = p; i < ar.length; i++) {
		temp.add(ar[i]);
		subSets(res,temp,ar,i+1);
		temp.remove(temp.size()-1);
	}
	  
   }
    
}
