class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

       
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        
        StringBuilder res = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            char c = entry.getKey();
            int f = entry.getValue();
            for (int i = 0; i < f; i++) {
                res.append(c);
            }
        }

        return res.toString();
    }
}
