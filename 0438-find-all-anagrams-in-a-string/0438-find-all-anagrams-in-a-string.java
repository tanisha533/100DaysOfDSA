class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if (s.length() < p.length()) return list;
        int[] count = new int[26];
        for(int i=0; i < p.length(); i++){
            int index = p.charAt(i) - 'a';
            count[index]++;
        }
         
        int left=0;
        int k=p.length()-1;
        int [] scount=new int[26];
        for(int right=0; right<s.length(); right++){
            int index = s.charAt(right) - 'a';
            scount[index]++;
            if(right - left + 1 > p.length()){
                char leftChar = s.charAt(left);
                int leftIndex = leftChar - 'a';
                scount[leftIndex]--; 
                left++;
            }
            if(right - left + 1 == p.length()){
                if(Arrays.equals(count, scount)){
                    list.add(left);
                }
            }
        }
         return list;
        }

    }
