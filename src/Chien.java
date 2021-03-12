
public class Chien {
	private int taille;
	private int age;
	private String nom;
	private String race;
	private int life;
	public Chien(int taille, int age,String nom, String race,int life) {
		this.taille = taille;
		this.age = age;
		this.nom = nom;
		this.race = race;
		this.life = life;
	}	
	
	public String getNom() {
		return nom;
	}
	public void setLife(int degat) {
		life -= degat;
		if(life <= 0) {
			System.out.println("Bravo vous venez de vaincre " + nom);
		}
	}
	public int getLife() {
		return life;
	}
	public void SePresenter() {
		System.out.println("Je mesure " + taille + " cm "+" mon age est de "+age + " mon nom est "+nom + " ma race est "+race);
	}
	//Utile remplace l'id par le return de toString
	public String toString() {
		return nom + " " + race;
	}
	
}
