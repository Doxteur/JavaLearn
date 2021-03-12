
public class Animal {
	protected String prenom;
	protected int age;
	protected int taille;
	
	public Animal(String prenom, int age, int taille) {
		this.prenom = prenom;
		this.age = age;
		this.taille = taille;
	}
	void seDeplacer() {
		System.out.println("Je me deplace");
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getTaille() {
		return taille;
	}


	public void setTaille(int taille) {
		this.taille = taille;
	}

	public void sePresenter() {
		System.out.println("Bonjour, je suis un animal");
	}
}
