class Q27 {
    public static void main(String[] args) {
        int[] array = { 3, 2, 2, 3 };
        int result = removeElement(array, 3);
        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index += 1;
            }
        }
        return index;
    }
}
