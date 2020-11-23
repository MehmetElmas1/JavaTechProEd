package Multidimentionalarray;

public class Varargs02 {
    public static void main(String[] args) {

        //Varargs in yankis kullanimlari

        //1 her zaman en son paremetre olmalidir.
        valueChar('a');
        valueChar('a', 'b');
    }
        public static void valueChar(char ... c) {

        for(char w : c) {
            System.out.println(w);
        }

        }
    }

