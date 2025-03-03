package Zadania;

import java.util.Random;

public class TasksLab01
{
    protected String Task001()
    {
        return "Bartosz 20";
    }

    protected String Task002(float x, float y)
    {
        float sum = x + y;
        float differcence = x - y;
        float product = x * y;

        return "suma liczb: " + sum + ", różnica liczb: " + differcence + ", iloczyn liczb: " + product;
    }

    protected boolean Task003(int x)
    {
        if (x%2 == 0) return true;
        else return false;
    }

    protected boolean Task004(int x)
    {
        if (x % 3 == 0 && x % 5 == 0) return true;
        else return false;
    }

    protected float Task005(float x)
    {
        return x * x * x;
    }

    protected double Task006(double x)
    {
        return Math.sqrt(x);
    }

    Random random = new Random();

    protected boolean Task007(double x, double y, double z)
    {
        if(x + y > z && x + z > y && y + z > x) return true;
        else return false;
    }

}
