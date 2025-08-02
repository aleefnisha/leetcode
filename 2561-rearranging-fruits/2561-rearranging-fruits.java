import java.util.*;

class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> freq = new TreeMap<>();

        for (int x : basket1) freq.put(x, freq.getOrDefault(x, 0) + 1);
        for (int x : basket2) freq.put(x, freq.getOrDefault(x, 0) - 1);

        List<Integer> toSwap = new ArrayList<>();
        int minVal = Integer.MAX_VALUE;

        for (int key : freq.keySet()) {
            int count = freq.get(key);
            if (count % 2 != 0) return -1;
            for (int i = 0; i < Math.abs(count) / 2; i++) {
                toSwap.add(key);
            }
            minVal = Math.min(minVal, key);
        }

        Collections.sort(toSwap);

        long cost = 0;
        int n = toSwap.size();
        for (int i = 0; i < n / 2; i++) {
            cost += Math.min(toSwap.get(i), 2 * minVal);
        }

        return cost;
    }
}
