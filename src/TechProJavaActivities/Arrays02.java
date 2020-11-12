package TechProJavaActivities;



public class Arrays02 {
    public static void main(String[] args) {

        char arr1[] = new char[6];
        arr1[0] ='M';
        arr1[1] = 'E';
        arr1[2] = 'H';
        arr1[3] = 'M';
        arr1[4] = 'E';
        arr1[5] = 'T';

        for(int i=0; i<6; i++){
            System.out.println(arr1[i]);
        }
        System.out.println(arr1[5]);

        /// array length ini bulmak icin "arr ismi .lenth " yazmak yeterlidir.
        System.out.println(arr1.length);

        System.out.println(arr1.length-1);

        System.out.println(arr1[arr1.length-1]);
    }
}


