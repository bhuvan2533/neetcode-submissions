class Solution {
    public int totalFruit(int[] fruits) {
        int l =0, r=0, maxi = 0;
        int n = fruits.length;
        Map<Integer, Integer> mp = new HashMap<>();

        while(r<n) {
            mp.put(fruits[r], mp.getOrDefault(fruits[r], 0)+1);
            if(mp.size() > 2) {
                int leftFruit = fruits[l];
                mp.put(leftFruit, mp.getOrDefault(leftFruit, 0)-1);
                if(mp.get(leftFruit)==0)
                    mp.remove(leftFruit);
                l++;
            }
            maxi = Math.max(maxi, r-l+1);
            r++;
        }

        return maxi;
    }
}