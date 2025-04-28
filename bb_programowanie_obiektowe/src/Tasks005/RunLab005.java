package Tasks005;

import StableData.InputData;

public class RunLab005
{
    InputData inputData = new InputData();

    TasksLab005 tasksLab005 = new TasksLab005();

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
        System.out.println("Select a task");
        int select = inputData.InputInt();
        switch (select)
        {
            case 1: tasksLab005.Task001();
            case 2: tasksLab005.Task002();
            case 3: tasksLab005.Task003();
            case 4: tasksLab005.Task004();
        }
    }
}
