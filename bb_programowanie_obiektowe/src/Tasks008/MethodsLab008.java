package Tasks008;

public class MethodsLab008 {
    protected int Silnia(int n){
            if(n<0)
            {
                throw new BlednaWartoscDlaSilniException("Podano ujemną liczbę");
            }

            int silnia = 1;
            for (int i = 1; i <= n; i++) {
                silnia *= i;
            }
            return silnia;
    }
}
