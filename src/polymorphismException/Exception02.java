package polymorphismException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream file = new FileInputStream("C:/ ogrenci.txt");

    }
}
class ExceptionTryCatch {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("C:/ ogrenci.txt");
        } catch (FileNotFoundException e) {
            System.out.println(" Dosya path yanlis veya dosya silinmis");
        }
    }
}