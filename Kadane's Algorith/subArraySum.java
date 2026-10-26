 public static List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ArrayList<Integer> subarray = new ArrayList<>();

                for (int k = i; k <= j; k++)
                    subarray.add(arr[k]);

                ans.add(subarray);
            }
        }

        return ans;
    }
