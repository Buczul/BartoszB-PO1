package Tasks001;

import StableData.InputData;

import java.util.Random;

public class TasksLab001
{
    MethodsLab01 tasks = new MethodsLab01();

    InputData inputData = new InputData();

    protected void Task001()
    {
        System.out.println(tasks.TaskMethod001());
    }

    protected void Task002()
    {
        System.out.println("Podaj 1 liczbę");
        float a = inputData.InputFloat();
        System.out.println("Podaj 2 liczbę");
        float b = inputData.InputFloat();
        System.out.println(tasks.TaskMethod002(a, b));
    }

    protected void Task003()
    {
        System.out.println("Podaj liczbę");
        int x = inputData.InputInt();
        System.out.println(tasks.TaskMethod003(x));
    }

    protected void Task004()
    {
        System.out.println("Podaj liczbę");
        int y = inputData.InputInt();
        System.out.println(tasks.TaskMethod004(y));
    }

    protected void Task005()
    {
        System.out.println("Podaj liczbę");
        float z = inputData.InputInt();
        System.out.println(z + " do sześcianu = " + tasks.TaskMethod005(z));
    }

    protected void Task006()
    {
        System.out.println("Podaj liczbę");
        float c = inputData.InputInt();
        System.out.println("Pierwiastek z " + c + " to " + tasks.TaskMethod006(c));
    }

    protected void Task007()
    {
        Random rand = new Random();

        System.out.println("Wybierz zakres. Podaj liczbę od której ma się zaczynać: ");
        int r1 = inputData.InputInt();
        System.out.println("Podaj liczbę na której ma się kończyć: ");
        int r2 = inputData.InputInt();

        int t1 = rand.nextInt(r2 - r1) + r1;
        int t2 = rand.nextInt(r2 - r1) + r1;
        int t3 = rand.nextInt(r2 - r1) + r1;
        boolean triangle = tasks.TaskMethod007(t1, t2, t3);

        System.out.println(triangle);
        if(triangle == true)System.out.println("Z boków " + t1 + ", " + t2 + " i " + t3 + " da się stworzyć trójkąt");
        else System.out.println("Z boków " + t1 + ", " + t2 + " i " + t3 + " nie da się stworzyć trójkąta");
    }
}
