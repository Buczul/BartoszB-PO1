package Tasks005_4;

import StableData.InputData;
import Tasks005.Student;

public class Table
{
    protected Student[] students = new Student[100];
    InputData inputData = new InputData();

    private Student setBasicStudent()
    {
        return (new Student("","",0,"",0));
    }

    public Table()
    {
        for(int i = 0; i < students.length; i++)
        {
            students[i] = setBasicStudent();
        }
    }

    public void SetStudentByIndex(int index)
    {
        if(index >= 0 && index < students.length)
        {
            students[index].ChangeStudents();
            System.out.println("Dane zostały przypisane");
        }
        else System.out.println("Nie ma takiego studenta");
    }

    public void DeleteStudentDataByIndex(int index)
    {
        if(index >= 0 && index < students.length)
        {
            System.out.println("Czy na pewno chcesz usunąć dane Studenta? Jeżeli chesz, wpisz TAK:");
            String wybor = inputData.InputString();
            if(wybor.equals("TAK"))
            {
                students[index] = setBasicStudent();
                System.out.println("Usunięto dane studenta");
            }
            else System.out.println("Nie usunięto danych studenta");
        }
        else System.out.println("Nie ma takiego studenta");
    }

    public void ShowStudentByIndex(int index)
    {
        if(index >= 0 && index < students.length)
        {
            students[index].StudentDane();
        }
        else System.out.println("Nie ma takiego studenta");
    }

    public void ShowAllStudents()
    {
        for(int i = 0; i < students.length; i++)
        {
            students[i].StudentDane();
        }
    }

    public void ShowStudentsInRange(int low, int high)
    {
        if((low >= 0 && low < students.length && high >= 0 && high < students.length) && (low <= high))
        {
            for (int i = low; i < high; i++)
            {
                students[i].StudentDane();
            }
        }
        else System.out.println("Nie można wyświetlić studentów z takiego przedziału");

    }
}
