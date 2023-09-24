class Q202 {
    public static void main(String[] args) {
        isHappy(20);
    }

    public static boolean isHappy(int n) {
        // The only single digit numbers that can be happy numbers are 1 and 7
        String stringedVal = Integer.toString(n);
        int stringProcessed = 0;
        for (int i = 0; i < stringedVal.length(); i++) {
            int val = Character.getNumericValue(stringedVal.charAt(i));
            val *= val;
            stringProcessed += val;
        }
        System.out.println(stringProcessed);
        if (stringProcessed == 1 || n == 7) {
            return true;
        }
        if (stringedVal.length() <= 1) {
            return false;
        }
        return isHappy(stringProcessed);
    }
}
