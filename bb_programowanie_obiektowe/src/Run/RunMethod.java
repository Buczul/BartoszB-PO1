package Run;

import StableData.InputData;
import Tasks001.RunLab001;
import Tasks002.RunLab002;

public class RunMethod
{
    InputData inputData = new InputData();

    RunLab001 runLab001 = new RunLab001();
    RunLab002 runLab002 = new RunLab002();

    public void RunMain()
    {
        Menu();
    }

    private void Menu()
    {
        System.out.println("1. Lab 1");
        System.out.println("2. Lab 2");
        System.out.println("3. Lab 3");
        System.out.println("4. Lab 4");
        System.out.println("Select a lab");
        int select = inputData.InputInt();
        switch (select)
        {
            case 1: runLab001.RunMain();
            case 2: runLab002.RunMain();
        }
    }

}
