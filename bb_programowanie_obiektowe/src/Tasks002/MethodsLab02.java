package Tasks002;

public class MethodsLab02
{
    protected String TaskMethod001(double a, double b, double c)
    {
        double delta = b*b+((-4)*a*c);
        if(delta < 0) return "Równanie nie ma rozwiązań";
        else if(delta == 0)
        {
            double x = -b / (2 * a);
            return "x = " + x;
        }
        else
        {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "x1 = " + x1 + "oraz x2 = " + x2;
        }
    }

    protected double TaskMethod002a(double x)
    {
        if(x > 0) return 2*x;
        else if (x < 0) return -3*x;
        else return 0;
    }

    protected double TaskMethod002b(double x)
    {
        if(x >= 1) return x*x;
        else return x;
    }

    protected double TaskMethod002c(double x)
    {
        if(x > 2) return 2+x;
        else if(x == 2) return 8;
        else return 4-x;
    }

    protected String TaskMethod003(double x, double y, double z)
    {
        if(x <= y && y <= z) return x+", "+y+", "+z;
        else if(x <= z && z <= y) return x+", "+z+", "+y;
        else if(y <= x && x <= z) return y+", "+x+", "+z;
        else if(y <= z && z <= x) return y+", "+z+", "+x;
        else if(z <= x && x <= y) return z+", "+x+", "+y;
        else return z+", "+y+", "+x;
    }

    protected String TaskMethod004(boolean x, boolean y)
    {
        if(x && y) return "Weź parasol, dostaniesz się na uczelnie.";
        else if(!x && y) return "Dostaniesz się na uczelnie, miłego dnia i pięknej pogody.";
        else return "Nie dostaniesz się na uczelnie.";
    }

    protected String TaskMethod005(boolean x, boolean y)
    {
        if(!x || y) return "Możesz kupić samochód, zniżki na samochód nie ma";
        else if(!x || !y) return "Zakup samochodu trzeba odłożyć na później, zniżki na samochód nie ma";
        else return "Możesz kupić samochód";
    }

    protected double TaskMethod006(double x, int y, double z)
    {
        switch(y)
        {
            case 1: return x + z;
            case 2: return y - z;
            case 3: return z * x;
            case 4: return x / z;
            case 5: return z % x;
            default: return 0;
        }
    }
}
