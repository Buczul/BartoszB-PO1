package Zadania;

import java.util.Random;

public class Run
{
    InputData inputData = new InputData();

    TasksLab01 tasksLab01 = new TasksLab01();

    public void RunMain()
    {
        Menu();
    }

    private void Menu()
    {
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Task 3");
        System.out.println("4. Task 4");
        System.out.println("5. Task 5");
        System.out.println("6. Task 6");
        System.out.println("7. Task 7");
        System.out.println("8. Exit");
        System.out.println("Select a task");
        int select = inputData.InputInt();

        switch (select)
        {
            case 1:
            {
                System.out.println(tasksLab01.Task001());
            } break;

            case 2:
            {
                System.out.println("Podaj 1 liczbę");
                float a = inputData.InputFloat();
                System.out.println("Podaj 2 liczbę");
                float b = inputData.InputFloat();
                System.out.println(tasksLab01.Task002(a, b));
            } break;

            case 3:
            {
                System.out.println("Podaj liczbę");
                int x = inputData.InputInt();
                System.out.println(tasksLab01.Task003(x));
            } break;

            case 4:
            {
                System.out.println("Podaj liczbę");
                int y = inputData.InputInt();
                System.out.println(tasksLab01.Task004(y));
            } break;

            case 5:
            {
                System.out.println("Podaj liczbę");
                float z = inputData.InputInt();
                System.out.println(z + " do sześcianu = " + tasksLab01.Task005(z));
            }break;

            case 6:
            {
                System.out.println("Podaj liczbę");
                float c = inputData.InputInt();
                System.out.println("Pierwiastek z " + c + " to " + tasksLab01.Task006(c));
            } break;

            case 7:
            {
                Random rand = new Random();

                System.out.println("Wybierz zakres. Podaj liczbę od której ma się zaczynać: ");
                int r1 = inputData.InputInt();
                System.out.println("Podaj liczbę na której ma się kończyć: ");
                int r2 = inputData.InputInt();

                int t1 = rand.nextInt(r2 - r1) + r1;
                int t2 = rand.nextInt(r2 - r1) + r1;
                int t3 = rand.nextInt(r2 - r1) + r1;
                boolean triangle = tasksLab01.Task007(t1, t2, t3);

                System.out.println(triangle);
                if(triangle == true)System.out.println("Z boków " + t1 + ", " + t2 + " i " + t3 + " da się stworzyć trójkąt");
                else System.out.println("Z boków " + t1 + ", " + t2 + " i " + t3 + " nie da się stworzyć trójkąta");
            }break;

            default: break;
        }
    }
}
