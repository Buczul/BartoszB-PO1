package Tasks005;

public class Osoba
{
    private String imie, nazwisko;
    int wiek;

    protected Osoba(String imie, String nazwisko, int wiek)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    protected Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    protected Osoba() {};

    protected void PokazDane()
    {
        System.out.println("Imie: " + imie + ", Nazwisko: " + nazwisko + ", Wiek: " + wiek);
    }
}
