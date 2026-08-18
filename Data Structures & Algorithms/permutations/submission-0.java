class Solution {

    public static void permutations(int nums[], List<Integer> ans,
                                    List<List<Integer>> all) {

        if (ans.size() == nums.length) {
            all.add(new ArrayList<>(ans));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!ans.contains(nums[i])) {

                // Choose
                ans.add(nums[i]);

                // Explore
                permutations(nums, ans, all);

                // Backtrack
                ans.remove(ans.size() - 1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> all = new ArrayList<>();

        permutations(nums, new ArrayList<>(), all);

        return all;
    }
}