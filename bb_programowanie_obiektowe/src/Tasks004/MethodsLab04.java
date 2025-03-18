package Tasks004;

import java.util.Random;

public class MethodsLab04
{
    protected int TaskMethod001(int min, int max)
    {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    protected void TaskMethod002(int[] tab)
    {
        for(int i = 0; i < tab.length; i+=2)
        {
            System.out.print(tab[i] + "\t");
        }
        System.out.println();
    }

    protected void TaskMethod005(int[] tab)
    {
        int buff;
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                if(tab[j] > tab[j+1])
                {
                    buff = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = buff;
                }
            }
        }
    }

    private int silnia(int n)
    {
        if (n == 2) return 2;
        else return silnia(n - 1) * n;
    }

    protected void TaskMethod006(int[] tab)
    {
        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = silnia(tab[i]);
        }
    }

    protected String TaskMethod007(String[] tab1, String[] tab2)
    {
        int zle = 0;
        if(tab1.length == tab2.length)
        {
            for(int i = 0; i < tab1.length; i++)
            {
                if(tab1[i] == tab2[i]) zle++;
            }
            if (zle > 0) return "Tablice nie są takie same.";
            else return "Tablice są takie same.";
        }
        else return "Tablice nie są takie same.";
    }
}
