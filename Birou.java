
public class Birou {
	
	private Sertar a;
	private Sertar b;
	private int lungime, latime, inaltime;
	
	public Birou(Sertar a, Sertar b, int lungime, int latime, int inaltime) {
		this.a = a;
		this.b = b;
		this.lungime=lungime;
		this.latime=latime;
		this.inaltime=inaltime;
	}
	
	public void tiparesteComponente() {
        System.out.println("Birou: lungime = " + lungime + ", latime = " + latime + ", inaltime = " + inaltime);
		a.tipareste();
		b.tipareste();
	}
}
