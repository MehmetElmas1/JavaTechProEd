package Encapsulation;

public class Encapsulation {

    private String kimlikNo = "345789120";

    private int krediKartNo = 1234567890;
    private boolean soguk = true;

    public static void main(String[] args) {

        System.out.println();

    }

    public String getKimlikNo() {
        return kimlikNo;

    }

    public int getKrediKartNo() {
        return krediKartNo;

    }

    public boolean isSoguk() {
        return soguk;
    }

    public void setKimlikNo(String KimNo){
        this.kimlikNo = KimNo;
    }
    public void setKrediKartNo(int krediKartNo){
        this.krediKartNo = krediKartNo;
    }
    public void setSoguk(boolean soguk){
        this.soguk = soguk;
    }
}