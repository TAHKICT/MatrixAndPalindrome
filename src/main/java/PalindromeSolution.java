/**
 * Program should check the string and return number of chars what need to add to make palindrome.
 */
public class PalindromeSolution {

    /**
     * Solution based on bias of palindrome center and checking possibility of making palindrome each time.
     * @param s
     */
    public int solution(String s){
        int result = 0;

        for (int bias = 0; bias < s.length(); bias++) {
            if(isPalindrome(s, bias)) {
                System.out.println(bias);
                result = bias;
                break;
            }
        }

        return result;
    }

    /**
     * @param s checked string
     * @param bias bias number of palindrome center
     * @return boolean value that shows string is palindrome
     */
    private boolean isPalindrome(String s, int bias){
        boolean isPalindrome = true;

        for(int i=bias; i < (s.length()+bias)/2; i++){
            char left = s.charAt(i);
            char right = s.charAt(s.length()+bias-1-i);
            if(left != right) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    public static void main(String[]args){
        String checkedString = "sssasss";

        PalindromeSolution solution = new PalindromeSolution();
        solution.solution(checkedString);
    }
}
