package Abstraction01;

public class AileOdasi extends Otel {

    public static void main(String[] args) {
        AileOdasi musteri2 = new AileOdasi();
        musteri2.kahvalti();
        System.out.println("Wifi ucretiniz" + musteri2.wifi(6));

    }

    @Override
    public void kahvalti() {

        System.out.println("Kahvaltiniz cafetaryada olacaktir");
    }


}
