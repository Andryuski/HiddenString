import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

/**
 * Created by anryu on 2/28/2016.
 */
public class DecoderTest {
    Decoder decoder;

    @Test
    public void test() throws IOException {
        decoder = new Decoder();
        Path path = Paths.get("src/test/resources/plaintext.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
            String plaintext = reader.readLine();
            System.out.println(decoder.decode(plaintext));
        }
    }
}