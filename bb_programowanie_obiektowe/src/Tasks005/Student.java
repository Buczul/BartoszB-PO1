package Tasks005;

public class Student
{
    String imie, nazwisko, specjalonsc;
    int nr_albumu, rok_studiow;

     protected Student(String imie, String nazwisko, int nr_albumu, String specjalonsc, int rok_studiow)
     {
         this.imie = imie;
         this.nazwisko = nazwisko;
         this.nr_albumu = nr_albumu;
         this.specjalonsc = specjalonsc;
         this.rok_studiow = rok_studiow;
     }

     protected Student(String imie, String nazwisko, int nr_albumu)
     {
         this.imie = imie;
         this.nazwisko = nazwisko;
         this.nr_albumu = nr_albumu;
     }

     protected Student(int nr_albumu, String specjalonsc, int rok_studiow)
     {
         this.nr_albumu = nr_albumu;
         this.specjalonsc = specjalonsc;
         this.rok_studiow = rok_studiow;
     }

     protected Student(String imie, String nazwisko, String specjalonsc)
     {
         this.imie = imie;
         this.nazwisko = nazwisko;
         this.specjalonsc = specjalonsc;
     }

     protected void StudentDane()
     {
         System.out.println("Imie: " + imie + ", Nazwisko: " + nazwisko + ", Numer Albumu: " + nr_albumu + ", Specjalonsc: " + specjalonsc + ", Rok Studiow: " + rok_studiow);
     }
}
