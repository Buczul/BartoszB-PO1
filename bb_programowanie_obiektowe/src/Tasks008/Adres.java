package Tasks008;

import java.util.ArrayList;
import java.util.List;

public class Adres {

    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        StringBuilder errors = new StringBuilder();

        if(ulica==null){
            errors.append("Ulica nie może być null. ");
        }
        if(numerDomu<=0){
            errors.append("Numer domu nie może być mniejszy niż 1. ");
        }
        if(kodPocztowy==null){
            errors.append("Kod pocztowy nie może być null. ");
        }
        if(miasto==null){
            errors.append("Miasto nie może być null. ");
        }
        if(!errors.isEmpty()){
            throw new NieprawidlowyAdresException(errors.toString());
        }

        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }



}
