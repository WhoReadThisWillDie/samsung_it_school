import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("text.txt");
        PrintWriter printWriter = new PrintWriter(fos);
        printWriter.println("asdas");
        printWriter.println(123);
        printWriter.close();

//        File file = new File("src/some.txt");
//        Scanner in = null;
//        try {
//            Scanner in = new Scanner(file);
//            while (in.hasNext()) {
//                System.out.println(in.next());
//            }
//        } catch (FileNotFoundException e) {
//
//        } finally {
//            in.close();
//        }
    }

    public static void first() throws Exception{
        System.out.println("first start");
        second();
        System.out.println("first end");
    }

    public static void second() throws Exception{
        System.out.println("second start");
        third();
        System.out.println("second end");
    }

    public static void third() throws Exception{
        System.out.println("third start");
        if (true)
            throw new Exception("some exception");
        System.out.println("third end");
    }
}

class MyCatException extends RuntimeException {
    public MyCatException(Throwable cause) {
        super(cause);
    }

    public MyCatException() {
        super("My cat is broken");
    }
}

class Cat {
    int paws = 4;

    public void setPaws(int paws) {
        if (paws < 0)
            throw new MyCatException();
        if (paws > 4)
            throw new RuntimeException("Paws more than 4");
        System.out.println("paws = " + paws);
        this.paws = paws;
    }

    @Override
    public String toString() {
        return "Cat with paws = " + paws;
    }
}