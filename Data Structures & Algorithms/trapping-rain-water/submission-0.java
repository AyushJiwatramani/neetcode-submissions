class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxPrefix = new int[n];
        int[] maxSuffix = new int[n];
        int maxP = 0;
        for (int i = 0; i < n; i++) {
            maxPrefix[i] = maxP;
            maxP = Math.max(maxP, height[i]);
        }

        int maxS = 0;
        for (int i = n-1; i >= 0; i--) {
            maxSuffix[i] = maxS;
            maxS = Math.max(maxS, height[i]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            int x = Math.min(maxPrefix[i], maxSuffix[i]) - height[i];
            if (x > 0)
                res += x;
        }

        return res;
    }
}
