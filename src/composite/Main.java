package composite;

public class Main {

	public static void main(String[] args) {
		IComponent computerCase = new ComputerCase(50.0);
		IComponent cpu = new CPU(250.0);
		IComponent gpu = new GPU(420.0);
		IComponent memoryStick = new MemoryStick(55.0);
		IComponent motherboard = new Motherboard(220.0);
		motherboard.addComponent(memoryStick);
		motherboard.addComponent(gpu);
		motherboard.addComponent(cpu);
		computerCase.addComponent(motherboard);
		System.out.println(computerCase.getPrice());
		

	}

}
