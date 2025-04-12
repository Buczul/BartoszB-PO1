
class Prostokat extends Figura {
	double wys=0, szer=0;

	public Prostokat(double szer, double wys) {
		super();
		this.szer = szer;
		this.wys = wys;
	}

	public Prostokat(double szer, double wys, String kolor) {
		super(kolor);
		this.szer = szer;
		this.wys = wys;
	}

	double getPowierzchnia() {
        return (szer * wys);
    }

	void przesun(double px, double py) {
		punkt.przesun(px, py);
	}

	@Override
	String opis() {
		return "Prostokąt o wymiarach " + wys + " X " + szer;
	}
}