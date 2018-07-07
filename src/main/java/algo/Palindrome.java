package algo;

public class Palindrome {

    public boolean checkIfPalindrome(String text){
        boolean isPalindrome = true;

        for(int startIndex = 0, endIndex = text.length()-1; startIndex < endIndex; startIndex++, endIndex--){
            if(text.charAt(startIndex) != text.charAt(endIndex)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

}
