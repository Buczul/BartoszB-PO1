import static java.lang.Math.pow;

public class Okrag extends Figura{
    Punkt punkt = new Punkt();
    double promien;

    public Okrag(Punkt punkt, double promien) {
        this.punkt = punkt;
        this.promien = promien;
    }

    double getPowierzchnia() {
        return promien*promien*3.14;
    }

    double getSrednica() {
        return 2*promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    boolean wSrodku(Punkt p1) {
        if(pow(p1.getX() - punkt.getX(), 2) + pow(p1.getY() - punkt.getY(), 2) < pow(promien, 2)) return true;
        else return false;
    }

    @Override
    String opis() {
        return "Okrąg o promieniu " + promien;
    }
}
