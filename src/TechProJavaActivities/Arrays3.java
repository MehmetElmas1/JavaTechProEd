package TechProJavaActivities;

public class Arrays3 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 7, 9, 3};

//        for (int i =0; i<5; i++){
//
//            if(arr[i] ==3 ) {
//                System.out.println("3 Var");
//            }
//            else{
//                System.out.println("3 Yok");
//            }
//        }
        int counter = 0; //buna flag bayrek denir, sayac , kac defa saydigini gosterir
        for (int i = 0; i < 8; i++) {
            if (arr[i] == 3) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println( counter + " tane 3 var");
        }
        else {
            System.out.println(" 3 Yok");
        }
    }
}
