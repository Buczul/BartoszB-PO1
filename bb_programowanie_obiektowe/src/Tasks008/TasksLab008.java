package Tasks008;

import StableData.InputData;

public class TasksLab008 {
    InputData inputData = new InputData();
    MethodsLab008 methodsLab008 = new MethodsLab008();

    protected void Task001() {
        try {
            System.out.println("Podaj liczbę: ");
            String liczbastr = inputData.InputString();
            double liczba = Double.parseDouble(liczbastr);

            if (liczba < 0) {
                throw new IllegalArgumentException("Liczba nie może być ujemna");
            }

            liczba = Math.sqrt(liczba);
            System.out.println("Pierwiastek z podanej liczby to: " + liczba);
        }catch(NumberFormatException e) {
            System.out.println("Błąd: Podany ciąg nie jest poprawną liczbą");
        }catch(IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    protected void Task002() {
        System.out.println("Podaj liczbę");
        int n = inputData.InputInt();
        try {
            System.out.println(methodsLab008.Silnia(n));
        }catch(BlednaWartoscDlaSilniException e) {
            System.out.println("Błąd: "+ e.getMessage());
        }
    }

    protected void Task003() {
        String ulica = null;
        int numer = -2;
        String kod = null;
        String miasto = null;

        System.out.println(ulica+", "+numer+", "+kod+", "+miasto);

        try{
            Adres adres = new Adres(ulica, numer, kod, miasto);
        }catch(NieprawidlowyAdresException e) {
            System.out.println("Błąd: "+e.getMessage());
        }

        ulica = "Dąbrowskiego";
        miasto = "Rzeszów";

        System.out.println(ulica+", "+numer+", "+kod+", "+miasto);

        try{
            Adres adres = new Adres(ulica, numer, kod, miasto);
        }catch(NieprawidlowyAdresException e) {
            System.out.println("Błąd: "+e.getMessage());
        }
    }
}
