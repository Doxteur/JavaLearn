
public class Cochon {
	String prenom;
	int age;
	int taille;
	int degatPhysique;
	int life;
	int degatMagique;
	int pm;
	public Cochon(String prenom,int age,int taille, int degatPhysique,int degatMagique,int life,int pm) {
		this.prenom = prenom;
		this.age = age;
		this.taille= taille;
		this.degatPhysique = degatPhysique;
		this.life = life;
		this.pm = pm;
		this.degatMagique = degatMagique;
	}
	public String getPrenom() {
		return prenom;
	}
	public void affronteLeChien(Chien chien) {
		
		chien.setLife(degatPhysique);
		System.out.println("Vous attaquez le chien : ");
	}
	public void seDefendre() {
		
	}
	public void attackAvecMagie(Chien chien) {
		if(pm < 15) {
			System.out.println("Plus de magie ! ");
			return;
		}

		System.out.println("Vous attaquer le chien avec de la magie et consommer 15 pm:");
		
		chien.setLife(degatMagique);
		pm -= 15;
		System.out.println("Il ne vous reste plus que " + pm +" pm.");
	}
}
