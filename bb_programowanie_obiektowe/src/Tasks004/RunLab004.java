package Tasks004;

import StableData.InputData;

public class RunLab004
{
    InputData inputData = new InputData();

    TasksLab004 tasksLab004 = new TasksLab004();

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
        System.out.println("Select a task");

        int select = inputData.InputInt();
        switch (select)
        {
            case 1: tasksLab004.Task001();
            case 2: tasksLab004.Task002();
            case 3: tasksLab004.Task003();
            case 4: tasksLab004.Task004();
            case 5: tasksLab004.Task005();
            case 6: tasksLab004.Task006();
            case 7: tasksLab004.Task007();
        }
    }
}
