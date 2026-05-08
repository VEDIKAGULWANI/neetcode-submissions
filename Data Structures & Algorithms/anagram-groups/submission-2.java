class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, ArrayList<String>> map = new HashMap<>();
    for(String str : strs){
    int[] count = new int[26];
         for(char c : str.toCharArray()){
         count[c - 'a']++;
         }
    StringBuilder sb = new StringBuilder();
    for(int i =0; i<26;i++){
    sb.append("#"); sb.append(count[i]);
    }
    String key = sb.toString();
    if(!map.containsKey(key)){
        map.put(key , new ArrayList<String>());
    }
    map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
    }
}
