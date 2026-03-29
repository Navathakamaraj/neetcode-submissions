

class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        Arrays.sort(arr);
        List<int[]> freqList = new ArrayList<>();
        int nt = arr.length;

        int count = 1;
        int ans = arr[0];

        for (int i = 1; i < nt; i++) {
            if (arr[i] == ans) {
                count++;
            } else {
                freqList.add(new int[]{ans, count});
                ans = arr[i];
                count = 1;
            }
        }
        // add last run
        freqList.add(new int[]{ans, count});

        // sort by frequency descending
        freqList.sort((a, b) -> b[1] - a[1]);

        // collect top k elements
        int[] result = new int[Math.min(k, freqList.size())];
        for (int i = 0; i < result.length; i++) {
            result[i] = freqList.get(i)[0];
        }

        return result;
    }
}
