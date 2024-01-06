public class ReverseString {

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "Welcome";
        System.out.println("Input: " + input);
        String reversed = reverseString(input);
        System.out.println("Reversed Output: " + reversed);
    }
}
