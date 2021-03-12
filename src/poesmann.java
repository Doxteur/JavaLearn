import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class poesmann {

	public static void main(String[] args) {

		
		//Plus utilisé
		//int[] mytable = {5,6,1,2,3};
		//System.out.println(mytable[0]);
		
        /* 
        voiture myVoiture = new voiture(50);
        myVoiture.setName(a);
        myVoiture.showName();
        System.out.println(myVoiture.vitesse);
         */
        
        
        Chien newChien = new Chien("vert",15,15,"bernard");

        Chien newnewChien = new Chien("rouge",15,15,"jean");
        newChien.sePresenter();

        //Crée une list de type chien 
        List<Chien> chenil = new ArrayList<Chien>();
        
        //Ajoute un chien au chenil 
        chenil.add(newChien);
        chenil.add(newnewChien);
        Etudiant newEtudiant = new Etudiant("Doussain","Jimmy",19,"BTS SIO 1");
        
        //Ajout de chien a l'étudiant
        newEtudiant.AjouterunChien(newChien);
        newEtudiant.AjouterunChien(newnewChien);
        
        System.out.println("Le/Les chien(s) de l'etudiant est/sont");
        
        // Lecture de tous les noms des chiens	
        newEtudiant.sePresenter();
        
        //Partie du cochon
        
        Cochon monCochon = new Cochon("bernard", 35, 90, 15,20,50,30);
        newEtudiant.setCochon(monCochon);
        //System.out.println("Attention " + monCochon.getPrenom() + " attaque " + newnewChien.getNom());
        
        //monCochon.seDeplacer();
        //Partie combat 
        //System.out.println("Attentxion le chien : " + newnewChien.getNom() + " est apparue," + " Il a " + newnewChien.getLife()  + " point de vie, que faire ?");
        
        Scanner scanner = new Scanner(System.in);
        
        //Combat
       // do {
        	
        	System.out.println("Attaquer ? Se défendre ? ou Magie ? (a ou d ou m)");
        	String a = scanner.nextLine();
        	//newEtudiant.faireUneAction(a, newnewChien);
        
        	//System.out.println("La vie du chien est de " + newnewChien.getLife());

        	//} while(newnewChien.getLife() > 0);
        scanner.close();
        }
	}


