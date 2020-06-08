public class Gasienicowe extends Pojazd{
    int moc;
    final public void uruchomSilnik(){
        super.uruchomSilnik();
        System.out.println("Jest to pojazd gąsienicowy");
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public Gasienicowe(int rokProdukcji, String rodzajSilnika, String color, int masa, int moc) {
        super(rokProdukcji, rodzajSilnika, color, masa);
        this.moc = moc;
    }
}
class Czolg extends Gasienicowe{
    public Czolg(int rokProdukcji, String rodzajSilnika, String color, int masa, int moc) {
        super(rokProdukcji, rodzajSilnika, color, masa, moc);
    }
}
class Spychacz extends Gasienicowe{
    public Spychacz(int rokProdukcji, String rodzajSilnika, String color, int masa, int moc) {
        super(rokProdukcji, rodzajSilnika, color, masa, moc);
    }
}
