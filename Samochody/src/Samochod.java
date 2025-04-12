public class Samochod {
    String Marka, Model, Nadwozie, Kolor;
    int rokProdukcji, Przebieg;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.Kolor = kolor;
        this.Marka = marka;
        this.Model = model;
        this.Nadwozie = nadwozie;
        this.rokProdukcji = rokProdukcji;
        setPrzebieg(przebieg);
    }

    public Samochod() {
        this.Marka = "nieznana";
        this.Model = "nieznany";
        this.Nadwozie = "nieznane";
        this.Kolor = "nieznany";
        this.rokProdukcji = 0;
        this.Przebieg = 0;
    }

    public void setPrzebieg(int przebieg) {
        if(przebieg < 0) System.out.println("Przebieg powinien być nieujemny");
        else Przebieg = przebieg;
    }

    public String info() {
        return "Marka: " + Marka + ", Model: " + Model + ", Nadwozie: " + Nadwozie + ", Kolor: " + Kolor + ", Rok Produkcji: " + rokProdukcji + ", Przebieg: " + Przebieg;
    }
}
