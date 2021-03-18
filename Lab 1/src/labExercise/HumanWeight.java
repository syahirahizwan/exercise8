package labExercise;

public class HumanWeight {
	
	private double weight;
	private double earthWeight;
	
	public double getWeight() {
		weight = (earthWeight/9.81)*3.711;
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getEarthWeight() {
		return earthWeight;
	}
	public void setEarthWeight(double earthWeight) {
		this.earthWeight = earthWeight;
	}
//	public void calculateTotal()
//	{
	//	weight = (earthWeight/9.81)*3.711;
	//}
	
	
	

}
