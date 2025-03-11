package Tasks003;

import StableData.InputData;

import java.util.Random;

public class TasksLab003
{
    InputData inputData = new InputData();

    Random rand = new Random();

    protected void Task001()
    {
        System.out.println("Podaj liczbę studentów w grupie: ");
        int n = inputData.InputInt();
        int i = 1;
        double x;
        double suma = 0;
        while(i <= n)
        {
            System.out.println("Podaj liczbę punktów " + i + " studenta");
            x = inputData.InputDouble();
            suma += x;

            i++;
        }
        System.out.println("Średnia punktów w grupie: " + suma/n);
    }

    protected void Task002()
    {
        int iledod = 0;
        int ileuj = 0;
        double sumadod = 0;
        double sumauj = 0;

        for (int i=0;i<10;i++)
        {
            System.out.println("Podaj " + (i+1) + " liczbę");
            double x = inputData.InputDouble();
            if(x<0)
            {
                ileuj++;
                sumauj += x;
            }
            else if(x>0)
            {
                iledod++;
                sumadod += x;
            }
        }
        System.out.println("Jest " +iledod+ " liczb dodatnich, a ich suma to " +sumadod+ ".\nJest " +ileuj+ " liczb ujemnych, a ich suma to " +sumauj+ ".");
    }

    protected void Task003()
    {
        System.out.println("Dany jest ciąg o wzorze na n-ty wyraz: a(n) = (1+n)*n.\nPodaj liczbę wyrazów ciągu do wygenerowania.");
        int n = inputData.InputInt();
        int suma = 0;
        for(int i=1;i<=n;i++)
        {
            if(((2+i)*(i+1))%2==0)
            {
                suma += ((2+i)*(i+1));
            }
        }
        System.out.println("Suma wygenerowanych wyrazów parzystych: " + suma);
    }

    protected void Task004()
    {
        System.out.println("Podaj ilość liczb z przedziału (-10,45) którą chcesz wylosować.");
        int n = inputData.InputInt();
        int x;
        int suma = 0;
        for (int i=0;i<n;i++)
        {
            x = rand.nextInt(56)-10;
            System.out.println(x);
            if(x%2==0) suma += x;
        }
        System.out.println("Suma wylosowanych liczb parzystych: " + suma);
    }

    protected void Task005()
    {
        System.out.println("Podaj słowo");
        String s = inputData.InputString();
        int rozne_znaki = 0;
        for (int i=0;i<(s.length())/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) rozne_znaki++;
        }
        if(rozne_znaki==0) System.out.println("Słowo jest palindromem");
        else System.out.println("Słowo nie jest palindromem");
    }
}
