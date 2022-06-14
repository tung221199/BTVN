import java.io.IOException;
import java.io.UncheckedIOException;

public class Parent {
    private String name;


    public Parent(String name)  {
        this.name = name;
        throw new RuntimeException();
    }

    public Parent() throws IOException {
        throw new IOException();
    }
}
