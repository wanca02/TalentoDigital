package proyectoClass;

public class ProyectMain {

	public static void main(String[] args) {
		Portafolio<Proyect> port= new Portafolio<Proyect>();
		Proyect w1=new Proyect("Waldo1","description 1");
		Proyect w2=new Proyect("Waldo2","description 2");
		Proyect w3=new Proyect("Waldo3","description 3");
		Proyect w4=new Proyect("Waldo4","description 4");
		w1.setInitialCost(345.34);
		w2.setInitialCost(200.34);
		w3.setInitialCost(310.01);
		
		port.add(w1);
		port.add(w2);
		port.add(w3);
		port.add(w4);
		
		for(Proyect p: port) System.out.println(p.elevatorPitch());
	}

}
