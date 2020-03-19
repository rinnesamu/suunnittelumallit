package abstractfactory;

public class Main {

	public static void main(String[] args) {
		Jasper jasper = new Jasper(new AdidasFactory());
		
		System.out.println("Jasper aloittaa koulun! Jasperilla on päällään: ");
		jasper.printClothes();
		
		jasper.setFactory(new BossFactory());
		System.out.println("Jasper valmistuu koulusta! Nyt jasperilla on päällään: ");
		jasper.printClothes();
		
	}
}
