package proyectoClass;

class Proyect{
	private String name;
	private String description;
	private double initialCost; 
	
	public String elevatorPitch () {
		return name+"("+initialCost+")"+" : "+description;
	}
	
	public Proyect(){}
	public Proyect(String name){
		//super();
		this.name=name;
	}
	public Proyect(String name, String description) {
		//super();
		this.name=name;
		this.description=description;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}

}
