import java.util.ArrayList;
import java.util.List;

public class Etudiant {

	private String nom;
	private String prenom;
	private int age;
	private String classe;
	List<Chien> chenil = new ArrayList<Chien>();
    Cochon cochon;
	public Etudiant(String nom,String prenom,int age,String classe) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.classe = classe;
	}	
	
	public void sePresenter() {
		System.out.println("Bonjour je m'appelle " + nom +" "+ prenom + " Et j'ai " + age + " ans. Et je suis en " + classe);
		System.out.println("Je laisse mes chiens se presenter");
		System.out.println(" ");
		for(int i = 0; i < chenil.size(); i++){
		//chenil.get(i).SePresenter();
		}
	}

	public void AjouterunChien(Chien chien) {
		chenil.add(chien);
	}
	
	public void setCochon(Cochon cochon) {
		this.cochon = cochon;
	}
	/*
	public void faireUneAction(String action,Chien chien) {
		
		if(action.equals("a")) {
			cochon.affronteLeChien(chien);
		}else if(action.equals("d")) {
			cochon.seDefendre();
		}else if(action.equals("m")){
			System.out.println("Vous attaquer : ");
			
			cochon.attackAvecMagie(chien);
		}
		*/
		
	}
	
	

