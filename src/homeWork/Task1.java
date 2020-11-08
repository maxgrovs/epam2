package homeWork;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Task1 {
//http://phys.bspu.by/static/lib/inf/prg/java/letters/index.html  Русские буквы и не только...

    public static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("resources", "poem.txt");
        Path writePath = Paths.get("resources", "poem1.txt");

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(path.toFile())))) {

            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("\\p{Punct}|«|—|[0-9]|»", "");//рег для знаков пр

                calcSymbols(word);
            }
        }

        List<String> strings = new ArrayList<>();

        for (Map.Entry<Character, Integer> item : map.entrySet()) {

            String result = item.getKey() + " - " + item.getValue();

            strings.add(result);

        }

        Collections.sort(strings);

        // System.out.println(strings);

        Files.write(writePath, strings);

    }

    private static void calcSymbols(String word) {

        for (int i = 0; i < word.length(); i++) {

            char c = word.toLowerCase().charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, val + 1);
            } else {
                map.put(c, 1);
            }
        }
    }

}
