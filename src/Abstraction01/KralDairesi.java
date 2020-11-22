package Abstraction01;

public class KralDairesi extends Otel {
    public static void main(String[] args) {
KralDairesi musteri3 = new KralDairesi();
musteri3.kahvalti();
        System.out.println( "tv ucreti :"  + musteri3.tv("international",2));
        System.out.println(musteri3.wifi(11));
    }
    @Override
    public void kahvalti() {
        System.out.println("Kahvaltiniz teras katta kral bolumundedir");
    }

    public int tv(String international, int saat) {
        if (international.equals("international")) {
            return saat * 5;
        } else {
        }
        return 0; //yani fiyat yok
    }
}