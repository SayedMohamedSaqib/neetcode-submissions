class Solution {

    public void findSubsets(int[] nums, List<Integer> ans, int i,
                            List<List<Integer>> all) {

        if (i == nums.length) {
            all.add(new ArrayList<>(ans));
            return;
        }

        // Include
        ans.add(nums[i]);
        findSubsets(nums, ans, i + 1, all);

        // Backtrack
        ans.remove(ans.size() - 1);

        // Don't include
        findSubsets(nums, ans, i + 1, all);
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> all = new ArrayList<>();

        findSubsets(nums, new ArrayList<>(), 0, all);

        return all;
    }
}