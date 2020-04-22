package prototype;

public class Main {

	public static void main(String[] args) {
		System.out.println("Matalakopiot:");
		ShallowClock shallowClock = new ShallowClock();
		ShallowClock clonedShallowClock = (ShallowClock) shallowClock.clone();
		System.out.println("Kellon aika on " + shallowClock.getSeconds() + " ja sen matalakopion aika on " + clonedShallowClock.getSeconds());
		System.out.println("Vaihdetaan kellon aikaa");
		shallowClock.setTime(15);
		System.out.println("Kellon aika on " + shallowClock.getSeconds() + " ja sen matalakopion aika on " + clonedShallowClock.getSeconds());
		System.out.println("Vaihdetaan matalakopioidun kellon aikaa");
		clonedShallowClock.setTime(25);
		System.out.println("Kellon aika on " + shallowClock.getSeconds() + " ja sen matalakopion aika on " + clonedShallowClock.getSeconds());
		
		System.out.println("\nSyväkopiot:");
		DeepClock deepClock = new DeepClock();
		DeepClock clonedDeepClock = (DeepClock) deepClock.clone();
		System.out.println("Kellon aika on " + deepClock.getSeconds() + " ja sen syväkopion aika on " + clonedDeepClock.getSeconds());
		System.out.println("Vaihdetaan kellon aikaa");
		deepClock.setTime(5);
		System.out.println("Kellon aika on " + deepClock.getSeconds() + " ja sen syväkopion aika on " + clonedDeepClock.getSeconds());
		System.out.println("Vaihdetaan syväkopioidun kellon aikaa");
		clonedDeepClock.setTime(59);
		System.out.println("Kellon aika on " + deepClock.getSeconds() + " ja sen syväkopion aika on " + clonedDeepClock.getSeconds());
		
	}

}
