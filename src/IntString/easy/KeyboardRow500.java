package IntString.easy;

import java.util.stream.Stream;

public class KeyboardRow500 {
    public String[] findWords(String[] words){
        String keyBoradRegex = "[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*";
        return Stream.of(words).filter(word ->word.toLowerCase().matches(keyBoradRegex)).toArray(String[]::new);

    }
}
