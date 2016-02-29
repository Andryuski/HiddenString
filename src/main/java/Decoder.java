import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by anryu on 2/28/2016.
 */
public class Decoder {

    public static String decode(String plaintext) {

        return null;
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/plaintext.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
            String plaintext = reader.readLine();
            System.out.println(decode(plaintext));
        }
    }
}
