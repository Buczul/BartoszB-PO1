package Run;

import StableData.InputData;
import Tasks001.RunLab001;
import Tasks002.RunLab002;
import Tasks003.RunLab003;
import Tasks004.RunLab004;
import Tasks005.RunLab005;
import Tasks008.RunLab008;

public class RunMethod
{
    InputData inputData = new InputData();

    RunLab001 runLab001 = new RunLab001();
    RunLab002 runLab002 = new RunLab002();
    RunLab003 runLab003 = new RunLab003();
    RunLab004 runLab004 = new RunLab004();
    RunLab005 runLab005 = new RunLab005();
    RunLab008 runLab008 = new RunLab008();

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
        System.out.println("5. Lab 5");
        System.out.println("8. Lab 8");
        System.out.println("Select a lab");
        int select = inputData.InputInt();
        switch (select)
        {
            case 1: runLab001.RunMain();
            case 2: runLab002.RunMain();
            case 3: runLab003.RunMain();
            case 4: runLab004.RunMain();
            case 5: runLab005.RunMain();
            case 8: runLab008.RunMain();
        }
    }

}
