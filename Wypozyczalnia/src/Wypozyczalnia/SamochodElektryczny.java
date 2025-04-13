package Wypozyczalnia;

public class SamochodElektryczny extends Samochod implements Elektryczny {
    private int poziomBaterii=0;

    public SamochodElektryczny(String id, String model) {
        super(id, model);
    }

    @Override
    public int poziomNaladowania() {
        return poziomBaterii;
    }

    @Override
    public void Najaduj() {
        poziomBaterii = 100;
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return super.obliczKoszt(liczbaGodzin)*22.70;
    }
}
