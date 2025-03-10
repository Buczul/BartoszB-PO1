package Tasks001;

import java.util.Random;

public class MethodsLab01
{
    protected String TaskMethod001()
    {
        return "Bartosz 20";
    }

    protected String TaskMethod002(float x, float y)

    {
        float sum = x + y;
        float differcence = x - y;
        float product = x * y;

        return "suma liczb: " + sum + ", różnica liczb: " + differcence + ", iloczyn liczb: " + product;
    }

    protected boolean TaskMethod003(int x)
    {
        if (x%2 == 0) return true;
        else return false;
    }

    protected boolean TaskMethod004(int x)
    {
        if (x % 3 == 0 && x % 5 == 0) return true;
        else return false;
    }

    protected float TaskMethod005(float x)
    {
        return x * x * x;
    }

    protected double TaskMethod006(double x)
    {
        return Math.sqrt(x);
    }

    protected boolean TaskMethod007(double x, double y, double z)
    {
        if(x + y > z && x + z > y && y + z > x) return true;
        else return false;
    }

}
