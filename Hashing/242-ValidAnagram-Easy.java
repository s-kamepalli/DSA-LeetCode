class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        if((new String(s1)).equals(new String(t1)))
           return true;
        return false;   
    }

    //    int m = s.length();
    //     int n = t.length();
    //     if (m != n) return false;
    //     HashMap<Character, Integer> map = new HashMap<>(); 
    //     for (int i = 0; i < m; i++) {
    //         map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    //         map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
    //     }
    //     for (Integer value: map.values()) {
    //         if (value != 0) return false;
    //     }
    //     return true;
	
	/*
	int[] arr=new int[256];
        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        for(char ch:t.toCharArray()){
            arr[ch]--;
        }
        for(int x:arr){
            if(x!=0){
                return false;
            }
        }
        return true;
	*/
}