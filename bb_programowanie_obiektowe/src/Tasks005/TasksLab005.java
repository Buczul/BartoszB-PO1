package Tasks005;

import StableData.InputData;
import Tasks005_4.Table;

public class TasksLab005
{
    InputData inputData = new InputData();

    protected void Task001()
    {
        Osoba osoba1 = new Osoba("Jan", "Kowalski", 45);
        Osoba osoba2 = new Osoba("Piotr", "Nowak");
        Osoba osoba3 = new Osoba();

        osoba1.PokazDane();
        osoba2.PokazDane();
        osoba3.PokazDane();
    }

    protected void Task002()
    {
        Student student1 = new Student("Adam", "Kowalski", 133578, "Programowanie", 3);
        Student student2 = new Student("Kamil", "Nowak", 146782);
        Student student3 = new Student(192112, "Elektronika", 4);
        Student student4 = new Student("Tomasz", "Lewandowski", 128521);

        student1.StudentDane();
        student2.StudentDane();
        student3.StudentDane();
        student4.StudentDane();
    }

    protected void Task003()
    {
        String imie,nazwisko,specjalonsc;
        int nr_albumu,rok_studiow;

        System.out.println("Podaj imie studenta: ");
        imie = inputData.InputString();
        System.out.println("Podaj nazwisko studenta: ");
        nazwisko = inputData.InputString();
        System.out.println("Podaj specjalonsc studenta: ");
        specjalonsc = inputData.InputString();
        System.out.println("Podaj numer albumu studenta: ");
        nr_albumu = inputData.InputInt();
        System.out.println("Podaj rok studiow studenta: ");
        rok_studiow = inputData.InputInt();

        Student student = new Student(imie,nazwisko,nr_albumu,specjalonsc,rok_studiow);

        student.StudentDane();
    }

    protected void Task004()
    {
        Table studentsTable = new Table();
        System.out.println("Wygenerowano 100 studentów.");
        int i = 1;

        while (i > 0)
        {
            System.out.println("Podaj studenta któremu chcesz przypisać dane. Jeżeli nie chcesz nic przypisaywać, wpisz 0: ");
            i = inputData.InputInt();
            if(i > 0)studentsTable.SetStudentByIndex(i-1);
        }
        i = 1;

        while (i > 0)
        {
            System.out.println("Podaj studenta któremu chcesz usunąć dane. Jeżeli nie chcesz nic usuwać, wpisz 0: ");
            i = inputData.InputInt();
            if(i > 0)studentsTable.DeleteStudentDataByIndex(i-1);
        }
        i = 1;

        while (i > 0)
        {
            System.out.println("Podaj studenta którego dane chcesz wyświetlić. Jeżeli nie chcesz nic wyświetlać, wpisz 0: ");
            i = inputData.InputInt();
            if(i > 0)studentsTable.ShowStudentByIndex(i-1);
        }

        System.out.println("Czy chesz wyświetlić dane wszystkich studentów? Jeżeli chcesz, wpisz 1: ");
        i = inputData.InputInt();
        if(i == 1) studentsTable.ShowAllStudents();
        i = 1;

        int j;
        while (i > 0)
        {
            System.out.println("Od którego studenta wyświetlać dane? Jeżeli nie chcesz nic wyświetlać, wpisz 0: ");
            i = inputData.InputInt();
            if(i > 0)
            {
                System.out.println("Na jakim studencie zakończyć wyświetlanie danych: ");
                j = inputData.InputInt();
                studentsTable.ShowStudentsInRange(i,j);
            }
        }
    }
}
