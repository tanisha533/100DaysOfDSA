class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        //brute force h
       Set<Integer> set = new HashSet<>();
        for(int i=0;i<fruits.length;i++)
        {
            for(int j=0;j<baskets.length;j++)
            {
                if(fruits[i]<=baskets[j] && !set.contains(j))
                {
                  set.add(j);     
                  break;          
                }
            }
        }
        return fruits.length-set.size();
    }
}
