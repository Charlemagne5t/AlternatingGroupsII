public class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int c = 1;
        int n = colors.length;
        int res = 0;
        for(int i = 1; i < n + k - 1; i++) {
            int ind;
            if(i >= n){
                ind = i % n;
            }else {
                ind = i;
            }

            if((ind == 0 ? colors[n - 1] : colors[ind - 1]) != colors[ind]){
                c++;
            }else c = 1;
            if(c >= k){
                res++;
            }

        }

        return res;
    }
}
