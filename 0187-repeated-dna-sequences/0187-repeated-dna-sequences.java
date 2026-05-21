    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();
        int left=0;
        HashSet<String> set=new HashSet<>();
        for(int i=0; i+10<=s.length(); i++){
            String current=s.substring(i,i+10);
        if(set.contains(current) && !list.contains(current)){           
                list.add(s.substring(i,i+10));
            
            }
            else{
                left++;
            }
                set.add(s.substring(i,i+10));

        }
        return list;
        }
    }