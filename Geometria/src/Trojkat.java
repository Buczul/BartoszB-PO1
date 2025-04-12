
class Trojkat extends Figura {
	double wys=0, podst=0;

	Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(double podst, double wys, String kolor) {
		super(kolor);
		this.podst = podst;
		this.wys = wys;
	}

	@Override
	String opis() {
		return "Trojkat  o wysokości " + wys + " i podstawie " + podst;
	}
}