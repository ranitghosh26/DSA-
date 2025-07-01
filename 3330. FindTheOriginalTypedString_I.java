
class Solution {
    public int possibleStringCount(String word) {
        int ans = 1;
        int n = word.length();
        for(int i=0; i<n-1; i++){
            if(word.charAt(i) == word.charAt(i+1)){
                ans += 1;
            }
        }
        return ans;
    }
}
