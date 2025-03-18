package Tasks004;

import StableData.InputData;

public class TasksLab004
{
    InputData inputData = new InputData();
    
    MethodsLab04 methodsLab04 = new MethodsLab04();

    protected void Task001()
    {
        int[] tablica;
        System.out.println("Ile liczb do tablicy chcesz wylosować?");
        int n = inputData.InputInt();
        tablica = new int[n];
        System.out.println("Podaj dolną granicę przedziału z którego chcesz wylosować liczby:");
        int min = inputData.InputInt();
        System.out.println("Podaj górną granicę przedziału z którego chcesz wylosować liczby:");
        int max = inputData.InputInt();
        for (int i = 0; i < tablica.length; i++)
        {
            tablica[i] = methodsLab04.TaskMethod001(min, max);
            System.out.println(tablica[i]);
        }
        double suma = 0;
        for (int i: tablica)
        {
            suma += i;
        }
        System.out.println("Suma wylosowanych elementów: " + suma);
        System.out.println("Średnia wylosowanych elementów: " + suma/tablica.length);
    }

    protected void Task002()
    {
        int[] nieparzysta = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] parzysta = {1, 2, 3, 4, 5, 6, 7, 8};
        methodsLab04.TaskMethod002(nieparzysta);
        methodsLab04.TaskMethod002(parzysta);
    }

    protected void Task003()
    {
        String[] wyrazy = {"ala", "ma", "kota"};
        for(String i: wyrazy)
        {
            System.out.println(i.toUpperCase());
        }
    }

    protected void Task004()
    {
        String[] wyrazy = new String[5];
        System.out.println("Podaj 5 wyrazów do tablicy");
        for (int i = 0; i < 5; i++)
        {
            System.out.println((i+1) + " wyraz: ");
            wyrazy[i] = inputData.InputString();
        }
        for(int i = wyrazy.length-1; i >= 0; i--)
        {
            for(int j = wyrazy[i].length()-1; j >= 0; j--)
            {
                System.out.print(wyrazy[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

    protected void Task005()
    {
        int[] liczby = new int[8];
        System.out.println("Podaj 8 liczb do tablicy");
        for (int i = 0; i < 8; i++)
        {
            System.out.println((i+1) + " liczba: ");
            liczby[i] = inputData.InputInt();
        }
        methodsLab04.TaskMethod005(liczby);
        for(int i: liczby)
        {
            System.out.println(i);
        }
    }

    protected void Task006()
    {
        int[] liczby = new int[5];
        System.out.println("Podaj 5 liczb do tablicy");
        for (int i = 0; i < 5; i++)
        {
            System.out.println((i+1) + " liczba: ");
            liczby[i] = inputData.InputInt();
        }
        methodsLab04.TaskMethod006(liczby);
        for(int i: liczby)
        {
            System.out.println(i);
        }
    }

    protected void Task007()
    {
        System.out.println("Podaj 5 wrazów do 1 tablicy");
        String[] tab1 = new String[5];
        for (int i = 0; i < 5; i++)
        {
            System.out.println((i+1) + " wyraz: ");
            tab1[i] = inputData.InputString();
        }

        System.out.println("Podaj 5 wrazów do 2 tablicy");
        String[] tab2 = new String[5];
        for (int i = 0; i < 5; i++)
        {
            System.out.println((i+1) + " wyraz: ");
            tab2[i] = inputData.InputString();
        }

        System.out.println(methodsLab04.TaskMethod007(tab1, tab2));
    }
}
