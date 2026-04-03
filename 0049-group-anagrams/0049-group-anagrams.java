class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
    // Map to hold sorted string as key and list of anagrams as value
        HashMap<String, List<String>> mp = new HashMap<>();

        for (String word : strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // अगर key पहले से है तो list में add करो
            if (mp.containsKey(key)) {
                mp.get(key).add(word);
            } else {
                // नई list बनाओ और put करो
                List<String> list = new ArrayList<>();
                list.add(word);
                mp.put(key, list);
            }
        }

        // Map की values ही final answer हैं
        return new ArrayList<>(mp.values());
    }
}
