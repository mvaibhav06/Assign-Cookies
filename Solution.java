class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);

        int i = 0;
        int j = 0;
        int out = 0;
        // 7,8,9,10 -> 5,6,7,8
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                out++;
                i++;
                j++;
            }else if(s[j] < g[i]){
                j++;
            }else{
                break;
            }
        }
        return out;
    }
}
