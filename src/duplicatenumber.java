public class duplicatenumber {
    private static int findDuplicate(int nums[]) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == nums[i])
                    return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example 1
        int nums[] = {1, 3, 4, 2, 2,3,4};
        System.out.println(findDuplicate(nums));

    }
}