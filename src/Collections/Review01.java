package Collections;
import java.util.Arrays;
import java.util.Scanner;
public class Review01 {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            //	Kullanicidan adini ve soyadini aliniz
            //	 1)Ad ve soyadini console 'a yazdirin
            //   2)Sadece adini console •a yazdirin
            //	 3)Ad ve soyadinin ilk harflerini console •a yazdirin
            //	 4)Ad ve soyadini console' a tersten yazdirin
            //	 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada
            //	 console' a yazdirin.
//		Kullanicidan adini ve soyadini aliniz
            Scanner scan = new Scanner(System.in);
            System.out.println("Adinizi giriniz");
            String ilkAd = scan.next();
            System.out.println("Soyadinizi giriniz ");
            String soyAd = scan.next();

            //	 1)Ad ve soyadini console 'a yazdirin
            System.out.println("Tam ad: "+ ilkAd + " " + soyAd);

            //   2)Sadece adini console •a yazdirin
            System.out.println(" Ilk ad :" + ilkAd);

            //	 3)Ad ve soyadinin ilk harflerini console •a yazdirin
            System.out.println("Ilk adin birinci harfi: "+ ilkAd.charAt(0));
            System.out.println("Ilk adin birinci harfi: " + soyAd.charAt(0));

            //	 4)Ad ve soyadini console' a tersten yazdirin
            StringBuilder strB = new StringBuilder(ilkAd + " " + soyAd);
            System.out.println(strB.reverse());


            //	 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada
            //	 console' a yazdirin.

            String tamAd = ilkAd + soyAd;
            String harfArr[] = tamAd.split("");
            Arrays.sort(harfArr);
            System.out.println("Alfabetik sirada harfler:" + Arrays.toString(harfArr));

        }
    }

