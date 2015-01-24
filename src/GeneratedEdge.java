public class GeneratedEdge {
	private long id;
	private double weight;
	
	public GeneratedEdge(long id, double weight) {
		this.id = id;
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
        this.weight = weight;
    }
	
	public String toString() {
		return "[ " + id + " ] " + String.format("%.2f", weight);
	}
}
