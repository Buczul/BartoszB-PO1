package Tasks008;

import StableData.InputData;

public class RunLab008 {
    TasksLab008 tasksLab008 = new TasksLab008();

    InputData inputData = new InputData();

    public void RunMain(){
        Menu();
    }

    private void Menu(){
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Task 3");
        System.out.println("Select a task: ");
        int select = inputData.InputInt();

        switch (select){
            case 1: tasksLab008.Task001(); break;
            case 2: tasksLab008.Task002(); break;
            case 3: tasksLab008.Task003(); break;
            default: break;
        }
    }
}
