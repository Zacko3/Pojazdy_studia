public class Pojazd {
    int rokProdukcji;
    String rodzajSilnika;
    String color;
    int masa;

    public Pojazd(int rokProdukcji, String rodzajSilnika, String color, int masa) {
        this.rokProdukcji = rokProdukcji;
        this.rodzajSilnika = rodzajSilnika;
        this.color = color;
        this.masa = masa;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public void uruchomSilnik(){
        System.out.println("Silnik uruchomiono");
    }
}

