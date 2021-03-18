package labExercise;

public class demoHumanWeight {
	
	public static void main(String[] args)
	{
		HumanWeight human1 = new HumanWeight();
		human1.setEarthWeight(56.5);
		human1.getEarthWeight();
		System.out.print("Your weight in Earth is ");
		System.out.print(human1.getEarthWeight() + " kg.");
		System.out.print("\nYour weight in Mars is ");
		System.out.print(human1.getWeight() + " kg.");
	}
	
}
