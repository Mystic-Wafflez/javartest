import java.util.Scanner;
public class Autokostperjaar {
	public static void main(String[] args) {
		Autokostperjaar autokostperjaar = new Autokostperjaar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Voer verbruik in (l/100km):");
		double verbruik = scanner.nextDouble();
		System.out.println("Voer brandstofprijs in: ");
		double benzineprijs = scanner.nextDouble();
		System.out.println("Voer aankopkost in: ");
		double aankoopkost = scanner.nextDouble();
		System.out.println("Voer aantal jaren gebruik in: ");
		double jaren = scanner.nextDouble();
		System.out.println("Voer maandelijks benzinegebruik in: ");
		double verbruikmaand = scanner.nextDouble();
		System.out.println("Voer maandelijks gereden kilometers in: ");
		double kilometersmaand = scanner.nextDouble();
		String carmodel = "Subaru Impreza WRX STi (1997)";
		String cost = "24 500 euro";
		String kmjaar = "10000";
		String onderhoud = "100 euro";
		
		System.out.println("Model:" + " " + carmodel);
		System.out.println("Aankoopkost:" + " " + cost);
		System.out.println("Verbruik:" + " " + verbruik);
		System.out.println("Er wordt " + kmjaar + " " + " kilometer / jaar gereden.");
		System.out.println("Men geeft " + onderhoud + " " + " aan onderhoud uit.");
		autokostperjaar.benzine(verbruik, benzineprijs);
		autokostperjaar.kostenverdeling(aankoopkost, jaren);
		autokostperjaar.kostenverdelingmaand(verbruikmaand, kilometersmaand, benzineprijs);
		
		
	}
	public void benzine(double verbruik1, double benzineprijs) {
		double totaalverbruik =  verbruik1 * 100;
		double benzineprijsjaar = benzineprijs * totaalverbruik;
		System.out.println("In totaal verbruikt de auto" + " " + totaalverbruik + " " + "liter brandstof per jaar.");
		System.out.println("Men betaalt per jaar" + " €" + benzineprijsjaar + " " + "aan benzine.");
	}
	public void kostenverdeling(double aankoopkost, double jaren) {
		double afschrijving = aankoopkost/jaren;
		System.out.println("De jaarlijkse afschrijvingskost" + " €" + afschrijving + " ");
		
	}
	public void kostenverdelingmaand(double verbruikmaand, double kilometersmaand, double benzineprijs) {
		double benzineprijsmaand = benzineprijs * verbruikmaand;
		System.out.println("Men betaalt maandelijks " + "€ " + benzineprijsmaand + " " + "aan benzine.");
		
	}
}
