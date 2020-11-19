package polymorphismException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception01 {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("C/student.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
