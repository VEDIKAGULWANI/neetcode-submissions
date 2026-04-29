class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Step 2: Create buckets
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(key);
        }

        // Step 3: Collect top k
        int[] ans = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    ans[index++] = num;

                    if (index == k) {
                        return ans;
                    }
                }
            }
        }

        return ans;
    }
}