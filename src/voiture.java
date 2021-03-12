
public class voiture {
	String name;
	int vitesse;
	
	public voiture(int p_vitesse) {
		vitesse = p_vitesse;
	}
	
	public void setName(String myName) {
		name = myName;
	}
	
	public void showName() {
		System.out.println("Votre voiture s'appelle " + name);
	}
	
	
}
