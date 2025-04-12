public class Kwadrat extends Prostokat {
    public Kwadrat(double bok) {
        super(bok, bok);
    }

    public double getBok() {
        return szer;
    }

    public void setBok(double bok) {
        szer = bok;
        wys = bok;
    }

    @Override
    String opis() {
        return "Kwadrat o wymiarach " + wys + " X " + szer;
    }
}
