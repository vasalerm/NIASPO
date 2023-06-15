package Main;

import org.springframework.util.DigestUtils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Engine {
    private final Path inputFilePath;
    private final Path outputFilePath;
    private String hash;

    public Engine(String inputFilePath, String outputFilePath) {
        this.inputFilePath = Paths.get(inputFilePath);
        this.outputFilePath = Paths.get(outputFilePath);
    }

    @PostConstruct
    public void init() throws IOException {
        if (Files.exists(inputFilePath)) {
            byte[] bytes = Files.readAllBytes(inputFilePath);
            hash = DigestUtils.md5DigestAsHex(bytes);
            Files.deleteIfExists(inputFilePath);
        } else {
            hash = null;
        }
        Files.write(outputFilePath, hash == null ? "null".getBytes() : hash.getBytes());
    }

    public void start() {
        System.out.println("Hash: " + hash);
    }

    @PreDestroy
    public void destroy() throws IOException {
        Files.deleteIfExists(inputFilePath);
    }
}
