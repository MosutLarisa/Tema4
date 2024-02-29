
public class Main {

	public static void main(String[] args) {
		Sertar a = new Sertar(30, 10, 5);
		Sertar b = new Sertar(15, 8, 5);
		
		Birou birou = new Birou(a, b, 50, 20, 15);
		
		birou.tiparesteComponente();
		
	}
}
