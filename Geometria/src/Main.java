//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(2,9);

        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println(kwadrat.opis());
        Prostokat prostokat = new Prostokat(3,8);
        System.out.println(prostokat.opis());
        Okrag okrag = new Okrag(punkt, 7);
        System.out.println(okrag.opis());
        Trojkat trokat = new Trojkat(5,6);
        System.out.println(trokat.opis());
    }
}