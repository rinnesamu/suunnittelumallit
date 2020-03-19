package abstractfactory;

public class Main {

	public static void main(String[] args) {
		IHat hat;
		IShirt shirt;
		IPants pants;
		IShoes shoes;
		
		IClothesFactory factory = new AdidasFactory();
		System.out.println("Jasper alottaa koulun");
		for (int i = 0; i < 2; i++) {
			hat = factory.createHat();
			shirt = factory.createShirt();
			pants = factory.createPants();
			shoes = factory.createShoes();
			
			System.out.println("Jasperilla on päällä:");
			hat.print();
			shirt.print();
			pants.print();
			shoes.print();
			if (i == 0) {
				System.out.println("Jasperi valmistuu koulusta!");
				factory = new BossFactory();
			}
		}
		

	}

}
