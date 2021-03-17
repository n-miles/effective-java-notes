package chapter2.dependencyinjection.factoryinjection;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FileCreatorTest {

    @Mock
    public OutputStream outputStream;

    private FileCreator fileCreator;

    @BeforeEach
    public void setup() {
        fileCreator = new FileCreator(path -> outputStream);
    }

    @Test
    public void correctContentsAreWritten() throws IOException {
        fileCreator.createOrReplace(Path.of("home"), "hello world");

        verify(outputStream).write(eq("hello world".getBytes(StandardCharsets.UTF_8)));
    }
}
