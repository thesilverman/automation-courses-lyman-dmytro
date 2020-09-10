package homeworks.homework_6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exersise_4 {

    public static void main(String[] args) {

        String str = "aaa bbb eee ooooo yyyyy i ppp rrrr zzzzz";

        Predicate<String> isVowel = s -> s.startsWith("a")
                || s.startsWith("o")
                || s.startsWith("i")
                || s.startsWith("u")
                || s.startsWith("e")
                || s.startsWith("y");

        Map<Integer, List<String>> result = Arrays.stream(str.split(" "))
                .filter(s -> !isVowel.test(s))
                .collect(Collectors.groupingBy(String::length));

        System.out.println(result);
}
}