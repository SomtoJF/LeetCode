class Q26 {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 3, 4, 4 };
        int result = removeDuplicates(array);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index += 1;
            }
        }
        return index;
    }
}
