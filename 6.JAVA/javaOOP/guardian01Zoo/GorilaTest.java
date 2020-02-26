package guardian01Zoo;

public class GorilaTest {
	public static void main(String[] args) {
		Gorila g = new Gorila();
		g.energyInit();
		g.displayEnergy();
		for(int i=0;i<3;i++) g.throwSomething();
		g.displayEnergy();
		for(int i=0;i<2;i++) g.eatBananas();
		g.displayEnergy();
		g.climb();
		g.displayEnergy();
	}
}
