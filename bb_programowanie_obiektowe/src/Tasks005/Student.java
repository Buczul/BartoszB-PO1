package Tasks005;

import StableData.InputData;

import java.awt.*;

public class Student
{
    String imie, nazwisko, specjalonsc;
    int nr_albumu, rok_studiow;

     public Student(String imie, String nazwisko, int nr_albumu, String specjalonsc, int rok_studiow)
     {
         this.imie = imie;
         this.nazwisko = nazwisko;
         this.nr_albumu = nr_albumu;
         this.specjalonsc = specjalonsc;
         this.rok_studiow = rok_studiow;
     }

     public Student(String imie, String nazwisko, int nr_albumu)
     {
         this.imie = imie;
         this.nazwisko = nazwisko;
         this.nr_albumu = nr_albumu;
     }

     public Student(int nr_albumu, String specjalonsc, int rok_studiow)
     {
         this.nr_albumu = nr_albumu;
         this.specjalonsc = specjalonsc;
         this.rok_studiow = rok_studiow;
     }

     public Student(String imie, String nazwisko, String specjalonsc)
     {
         this.imie = imie;
         this.nazwisko = nazwisko;
         this.specjalonsc = specjalonsc;
     }

     public Student() {}

     public void StudentDane()
     {
         System.out.println("Imie: " + imie + ", Nazwisko: " + nazwisko + ", Numer Albumu: " + nr_albumu + ", Specjalonsc: " + specjalonsc + ", Rok Studiow: " + rok_studiow);
     }

     public String getImie(String imie)
     {
         return imie;
     }
     public void setImie(String imie)
     {
         this.imie = imie;
     }

     public String getNazwisko(String nazwisko)
     {
         return nazwisko;
     }
     public void setNazwisko(String nazwisko)
     {
         this.nazwisko = nazwisko;
     }

     public int getNr_albumu(int nr_albumu)
     {
         return nr_albumu;
     }
     public void setNr_albumu(int nr_albumu)
     {
         this.nr_albumu = nr_albumu;
     }

     public String getSpecjalonsc(String specjalonsc)
     {
         return specjalonsc;
     }
     public void setSpecjalonsc(String specjalonsc)
     {
         this.specjalonsc = specjalonsc;
     }

     public int getRok_studiow(int rok_studiow)
     {
         return rok_studiow;
     }
     public void setRok_studiow(int rok_studiow)
     {
         this.rok_studiow = rok_studiow;
     }

    public void ChangeStudents()
    {
        InputData inputData = new InputData();
        System.out.println("Podaj imie: ");
        setImie(inputData.InputString());
        System.out.println("Podaj nazwisko: ");
        setNazwisko(inputData.InputString());
        System.out.println("Podaj numer albumu: ");
        setNr_albumu(inputData.InputInt());
        System.out.println("Podaj specjalonsc: ");
        setSpecjalonsc(inputData.InputString());
        System.out.println("Podaj rok studiow: ");
        setRok_studiow(inputData.InputInt());
    }
}
