class Solution {
    public int trap(int[] height) {
        
        int leftmax[] = new int [height.length];
        leftmax[0] = height[0];
        for(int i = 1; i < leftmax.length; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }

        int rightmax[] = new int [height.length];
        rightmax[rightmax.length - 1] = height[height.length - 1];
        for(int i = rightmax.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trapped_water = 0;
        for(int i = 0; i < height.length; i++) {
            int water_level = Math.min(leftmax[i], rightmax[i]);

            trapped_water += water_level - height[i];

        }

        return trapped_water;
    }
}
