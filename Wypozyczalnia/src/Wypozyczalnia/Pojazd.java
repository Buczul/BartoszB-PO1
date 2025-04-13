package Wypozyczalnia;

abstract class Pojazd {
    protected String id,Model;
    protected boolean czyDostepny=true;

    public Pojazd(String id, String model) {
        this.id = id;
        this.Model = model;
    }

    public void Wypozycz(){
        czyDostepny = false;
    }

    public void Zwroc(){
        czyDostepny = true;
    }

    public boolean isCzyDostepny() {
        return czyDostepny;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return Model;
    }

    public double obliczKoszt(int liczbaGodzin){
        return liczbaGodzin;
    }
}
