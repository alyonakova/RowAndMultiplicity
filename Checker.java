public class Checker {
    /**
     * Finds numbers that are divisible without a remainder by the number of digits of this number and prints it
     * @param N count of printed numbers
     */
    public void check(int N) {
        int onScreen = 0;
        int current = 0;
        while (onScreen != N) {
            int digitsCount = getNumberOfDigits(current, 0);
            if (current % digitsCount == 0) {
                System.out.print(current + " ");
                onScreen++;
            }
            current++;
        }
    }

    /**
     * Gets a count of digits in the number
     * @param number
     * @param currentSum is a current number of digits, should be 0 when calling the function
     * @return a count of digits in the number
     */
    public int getNumberOfDigits(int number, int currentSum) {
       currentSum++;
       if (number >= 10) currentSum = getNumberOfDigits(number/10, currentSum);
       return currentSum;
    }
}
