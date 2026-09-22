class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        maxHeap.addAll(map.entrySet());

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = maxHeap.poll().getKey();
        }

        return res;
    }
}
