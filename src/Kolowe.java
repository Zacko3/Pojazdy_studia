public class Kolowe extends Pojazd {
    String rozmiarOpony;
    public void uruchomSilnik(String rodzajSilnika){
        System.out.println("Uruchomiono silnik " + rodzajSilnika);
    }

    public String getRozmiarOpony() {
        return rozmiarOpony;
    }

    public void setRozmiarOpony(String rozmiarOpony) {
        this.rozmiarOpony = rozmiarOpony;
    }

    public Kolowe(int rokProdukcji, String rodzajSilnika, String color, int masa, String rozmiarOpony) {
        super(rokProdukcji, rodzajSilnika, color, masa);
        this.rozmiarOpony = rozmiarOpony;
    }
}

class Ciezarowka extends Kolowe {
    int udzwig;
    void podniesSkrzynie(){
        System.out.println("Skrzynia podniesiona");
    }

    public int getUdzwig() {
        return udzwig;
    }

    public void setUdzwig(int udzwig) {
        this.udzwig = udzwig;
    }

    public Ciezarowka(int rokProdukcji, String rodzajSilnika, String color, int masa, String rozmiarOpony, int udzwig) {
        super(rokProdukcji, rodzajSilnika, color, masa, rozmiarOpony);
        this.udzwig = udzwig;
    }
}
class Osobowy extends Kolowe{
    int iloscOsob;

    public int getIloscOsob() {
        return iloscOsob;
    }

    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }

    public Osobowy(int rokProdukcji, String rodzajSilnika, String color, int masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, color, masa, rozmiarOpony);
        this.iloscOsob = iloscOsob;
    }
}
class Sedan extends Osobowy{
    public Sedan(int rokProdukcji, String rodzajSilnika, String color, int masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, color, masa, rozmiarOpony, iloscOsob);
    }
    String model;
    String symbol;

}
class Pickup extends Osobowy{
    public Pickup(int rokProdukcji, String rodzajSilnika, String color, int masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, color, masa, rozmiarOpony, iloscOsob);
    }
}
class Skoda extends Sedan{
    public Skoda(int rokProdukcji, String rodzajSilnika, String color, int masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, color, masa, rozmiarOpony, iloscOsob);
    }
}
class VW extends Sedan{
    public VW(int rokProdukcji, String rodzajSilnika, String color, int masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, color, masa, rozmiarOpony, iloscOsob);
    }
}
class SuperB extends Skoda{
    public SuperB(int rokProdukcji, String rodzajSilnika, String color, int masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, color, masa, rozmiarOpony, iloscOsob);
    }
}
final class Octavia extends Skoda{
    public Octavia(int rokProdukcji, String rodzajSilnika, String color, int masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, color, masa, rozmiarOpony, iloscOsob);
    }
}
class Golf extends VW{

    public Golf(int rokProdukcji, String rodzajSilnika, String color, int masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, color, masa, rozmiarOpony, iloscOsob);
    }
}

