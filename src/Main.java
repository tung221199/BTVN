import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Children children2 = new Children("Tung");
        } catch (RuntimeException e){
            System.out.println("Catch Runtime Exception");
        }

        try {
            Children children1 = new Children();
        } catch (IOException e) {
            System.out.println("Catch IOException");
        }

    }
}
