class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();

        for(String str:strs){
            char[] chArr=str.toCharArray();
            Arrays.sort(chArr);
            String sortedWord=new String(chArr);

            if(!map.containsKey(sortedWord))
                map.put(sortedWord,new ArrayList<>());

            map.get(sortedWord).add(str);
        }

        return new ArrayList<>(map.values());
    }
}