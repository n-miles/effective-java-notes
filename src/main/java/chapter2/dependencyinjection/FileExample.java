package chapter2.dependencyinjection;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static java.nio.file.StandardOpenOption.WRITE;

import chapter2.dependencyinjection.factoryinjection.FileCreator;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample {

    public static void main(String[] args) throws IOException {
        FileCreator fileCreator = new FileCreator(path -> Files.newOutputStream(path, WRITE, TRUNCATE_EXISTING, CREATE));

        fileCreator.createOrReplace(Path.of("bip-bap"), "hello world!");
    }
}
