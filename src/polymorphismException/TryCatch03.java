package polymorphismException;

public class TryCatch03 {
    public static void main(String[] args) {

        System.out.println(exceptions());
    }
    public static String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result = result + "before";
                v.length();
                result = result + "after";
            } catch (NullPointerException e) {
                result = result + "catch";
                throw new RuntimeException();
            } finally {
                result = result + "finally";
            }
        } catch (Exception e) {
            result = result + "done";
        }
return result;
        }
    }
