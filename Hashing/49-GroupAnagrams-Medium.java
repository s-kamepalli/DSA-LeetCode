class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length ==0 )
          return result;
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {  // o(n)
            char[] c = str.toCharArray(); //o(klogk)
            Arrays.sort(c);
            String sortedString = new String(c);
            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }
        return new ArrayList(map.values());
    }
	
	/* Better
	public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word: strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (map.containsKey(key)) {
                map.get(key).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key, list);
            }
        }
        List<List<String>> finalList = new ArrayList<>(map.values());
        return finalList;
    }
	*/
}