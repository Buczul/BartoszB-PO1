public class SamochodOsobowy extends Samochod {
    double Waga, Pojemnosc;
    int IloscOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg, int iloscOsob, double pojemnosc, double waga) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.IloscOsob = iloscOsob;
        this.Pojemnosc = pojemnosc;
        this.Waga = waga;
    }

    public SamochodOsobowy() {
        this.IloscOsob = 0;
        this.Pojemnosc = 0;
        this.Waga = 0;
    }

    public void setWaga(double waga) {
        if(waga > 2 && waga < 4.5) {
            Waga = waga;
        }
        else System.out.println("Waga powinna wynosić 2 - 4,5t");
    }

    public void setPojemnosc(double pojemnosc) {
        if(pojemnosc > 0.8 && pojemnosc < 3) {
            Pojemnosc = pojemnosc;
        }
        else System.out.println("Pojemność powinna wynosić 0,8 - 3");
    }

    @Override
    public String info() {
        return super.info() + ", Ilość osób: " + IloscOsob + ", Pojemność silnika: " + Pojemnosc + ", Waga: " + Waga;
    }
}
