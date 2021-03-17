package chapter2.dependencyinjection.factoryinjection;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class FileCreator {

    private final IOExceptionFunction<Path, OutputStream> fileFactory;

    public FileCreator(IOExceptionFunction<Path, OutputStream> fileFactory) {
        this.fileFactory = fileFactory;
    }

    public void createOrReplace(Path path, String contents) throws IOException {
        OutputStream file = fileFactory.apply(path);
        file.write(contents.getBytes(StandardCharsets.UTF_8));
    }

    @FunctionalInterface
    public interface IOExceptionFunction<T, U> {
        U apply(T t) throws IOException;
    }
}
