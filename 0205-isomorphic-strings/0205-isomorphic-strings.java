class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
        HashSet<String> pair=new HashSet<>();
        for(int i=0; i<s.length(); i++){
            set1.add(s.charAt(i));
        }
        for(int i=0; i<t.length(); i++){
            set2.add(t.charAt(i));
            String p=" "+s.charAt(i)+t.charAt(i);
            pair.add(p);
        }


       return set1.size()==set2.size() && set1.size()==pair.size();
    }
}