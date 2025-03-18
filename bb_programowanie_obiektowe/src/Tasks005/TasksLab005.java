package Tasks005;

public class TasksLab005
{
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
}
