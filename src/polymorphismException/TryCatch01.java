package polymorphismException;

public class TryCatch01 {
    public static void main(String[] args) {

        int num1 =12;
        int num2 =0;

        try{
            System.out.println(num1/num2);
        } catch(ArithmeticException e){
            System.out.println("Sifir ile bolme yapilamaz");
        }
    }
}

