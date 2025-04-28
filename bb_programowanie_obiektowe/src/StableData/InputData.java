package StableData;
import java.util.Scanner;
// klasa do wczytywania danych


public class InputData
{
    //obiekt klasy scanner
    Scanner input = new Scanner(System.in);
    //metoda do pobierania danych od uzytkownika
    public int InputInt()
    {
        return input.nextInt();
    }

    //metody do wczytywania float, double, sting, boolen
    public float InputFloat()
    {
        return input.nextFloat();
    }

    public double InputDouble()
    {
        return input.nextDouble();
    }

    public String InputString()
    {
        return input.next();
    }

    public boolean InputBoolean()
    {
        return input.nextBoolean();
    }

    public char InputChar()
    {
        return input.next().charAt(0);
    }
}
