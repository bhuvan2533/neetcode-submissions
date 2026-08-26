class Solution {
    public int totalFruit(int[] fruits) {
        int l =0, r=0, maxi = 0;
        int n = fruits.length;
        Map<Integer, Integer> mp = new HashMap<>();

        while(r<n) {
            mp.put(fruits[r], mp.getOrDefault(fruits[r], 0)+1);
            if(mp.size() > 2) {
                mp.put(fruits[l], mp.getOrDefault(fruits[l], 0)-1);
                if(mp.get(fruits[l])==0)
                    mp.remove(fruits[l]);
                l++;
            }
            maxi = Math.max(maxi, r-l+1);
            r++;
        }

        return maxi;
    }
}