class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resultMap = new HashMap<>();

        for(String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);

            String key = new String(temp);

            if(!resultMap.containsKey(key)) {
                resultMap.put(key, new ArrayList<>());
            }
            resultMap.get(key).add(s);
        }

        List<List<String>> resList = new ArrayList<>();
        for(List<String> list : resultMap.values()) {
            resList.add(list);
        }

        return resList;
    }
}
