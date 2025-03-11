package Tasks003;

import StableData.InputData;

public class RunLab003
{
    InputData inputData = new InputData();

    TasksLab003 tasksLab003 = new TasksLab003();

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
        System.out.println("Select a task: ");
        int select = inputData.InputInt();
        switch (select)
        {
            case 1: tasksLab003.Task001();
            case 2: tasksLab003.Task002();
            case 3: tasksLab003.Task003();
            case 4: tasksLab003.Task004();
            case 5: tasksLab003.Task005();
        }

    }
}
