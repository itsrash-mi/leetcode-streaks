class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character>l = new HashSet<>();
        HashSet<Character>u = new HashSet<>();
        int ans=0;
        char[] c=word.toCharArray();
        for(char x:c)
        {
            if(Character.isLowerCase(x))
            {l.add(x);}
            else
            {u.add(x);}
        }
        for(char x:l)
        {
            if(u.contains(Character.toUpperCase(x)))
            {ans++;}
        }
        return ans;
    }
}