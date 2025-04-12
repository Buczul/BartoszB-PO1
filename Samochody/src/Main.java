//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Honda","Civic","sedan","Srebrny",1998,-13);
        Samochod samochod2 = new Samochod("Honda","Civic","sedan","Srebrny",1998,426421);
        System.out.println(samochod1.info());
        Samochod samochod3 = new Samochod();
        System.out.println(samochod3.info());
        SamochodOsobowy samochodOsobowy1 = new SamochodOsobowy("Audi","A4","kombi","Czarny",2010,130000,51,21,41);
        SamochodOsobowy samochodOsobowy2 = new SamochodOsobowy("Audi","A4","kombi","Czarny",2010,130000,5,2,4);
        System.out.println(samochodOsobowy2.info());
        SamochodOsobowy samochodOsobowy3 = new SamochodOsobowy();
        System.out.println(samochodOsobowy3.info());
    }
}