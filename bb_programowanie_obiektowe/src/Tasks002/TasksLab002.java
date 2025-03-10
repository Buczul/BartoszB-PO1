package Tasks002;

import StableData.InputData;

public class TasksLab002
{
    InputData inputData = new InputData();

    MethodsLab02 methodsLab02 = new MethodsLab02();

    protected void Task001()
    {
        System.out.println("Rozwiązywanie równania kwadratowego - ax2+bx+c. \n Podaj a.");
        double a = inputData.InputDouble();
        System.out.println("Podaj b.");
        double b = inputData.InputDouble();
        System.out.println("Podaj c.");
        double c = inputData.InputDouble();
        System.out.println(methodsLab02.TaskMethod001(a, b, c));
    }

    protected void Task002()
    {
        System.out.println("Podaj liczbę rzeczywistą");
        double liczba = inputData.InputDouble();
        System.out.println("a(x) = " + methodsLab02.TaskMethod002a(liczba));
        System.out.println("b(x) = " + methodsLab02.TaskMethod002b(liczba));
        System.out.println("c(x) = " + methodsLab02.TaskMethod002c(liczba));
    }

    protected void Task003()
    {
        System.out.println("Podaj pierwszą liczbę: ");
        double x = inputData.InputDouble();
        System.out.println("Podaj drugą liczbę: ");
        double y = inputData.InputDouble();
        System.out.println("Podaj trzecią liczbę: ");
        double z = inputData.InputDouble();
        System.out.println(methodsLab02.TaskMethod003(x, y, z));
    }

    protected void Task004()
    {
        System.out.println("Czy pada dzisiaj desz?\ntrue - Tak\nfalse - Nie");
        boolean x = inputData.InputBoolean();
        System.out.println("Czy jest dzisiaj autobus?\ntrue - Tak\nfalse - Nie");
        boolean y = inputData.InputBoolean();
        System.out.println(methodsLab02.TaskMethod004(x, y));
    }

    protected void Task005()
    {
        System.out.println("Czy jest zniżka na samochód?\ntrue - Tak\nfalse - Nie");
        boolean x = inputData.InputBoolean();
        System.out.println("Czy otrzymałeś podwyżkę?\ntrue - Tak\nfalse - Nie");
        boolean y = inputData.InputBoolean();
        System.out.println(methodsLab02.TaskMethod005(x, y));
    }

    protected void Task006()
    {
        System.out.println("Podaj pierwszą liczbę: ");
        double x = inputData.InputDouble();
        System.out.println("1 - dodawanie\n2 - odejmowanie\n3 - mnożenie\n4 - dzielenie\n5 - reszta z dzielenia\nPodaj znak działania: ");
        int y = inputData.InputInt();
        System.out.println("Podaj drugą liczbe: ");
        double z = inputData.InputDouble();
        System.out.println(methodsLab02.TaskMethod006(x, y, z));
    }
}
