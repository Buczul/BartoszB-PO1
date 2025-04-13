import Wypozyczalnia.SamochodElektryczny;

public class TaskWypozyczalnia {

    public void Wypozyczalnia() {
        example();
    }
    private void example() {
        SamochodElektryczny samochod1 = new SamochodElektryczny("SE0001","Tesla");
        SamochodElektryczny samochod2 = new SamochodElektryczny("SE0002","Audi");
        SamochodElektryczny samochod3 = new SamochodElektryczny("SE0003","Mercedes");

        System.out.println(samochod1.isCzyDostepny());
        System.out.println(samochod1.poziomNaladowania());

        samochod1.Wypozycz();
        samochod1.Najaduj();

        System.out.println(samochod1.isCzyDostepny());
        System.out.println(samochod1.poziomNaladowania());
    }
}
