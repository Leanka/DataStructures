package algo;

public class StringReverser {

    public String reverse(String text){
        int textLength = text.length();
        StringBuilder builder = new StringBuilder();

        while (--textLength >= 0){
            builder.append(text.charAt(textLength));
        }

        return builder.toString();
    }
}
