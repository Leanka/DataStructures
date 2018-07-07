package algorithms;

public class TitleCase {

    public String titleCase(String text){
        String [] words = text.split("[\\s]+");
        StringBuilder builder;

        for(int index = 0; index < words.length; index++){
            builder = new StringBuilder(words[index].substring(0, 1).toUpperCase());
            builder.append(words[index].substring(1).toLowerCase());
            words[index] = builder.toString();
        }

        return String.join(" ", words);
    }
}
