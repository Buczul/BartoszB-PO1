package Wypozyczalnia;

public class Samochod extends Pojazd {
    public Samochod(String id, String model) {
        super(id, model);
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return super.obliczKoszt(liczbaGodzin)*20.50;
    }
}
