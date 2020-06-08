public class Szynowe extends Pojazd{
    public Szynowe(int rokProdukcji, String rodzajSilnika, String color, int masa) {
        super(rokProdukcji, rodzajSilnika, color, masa);
    }

    public void uruchomSilnik(){
        System.out.println("uruchomiono silnik pojazdu szynowego");
    }
}
class Pociag extends Szynowe{
    public Pociag(int rokProdukcji, String rodzajSilnika, String color, int masa) {
        super(rokProdukcji, rodzajSilnika, color, masa);
    }
    static String wlasciciel = "P.K.P.";

}
