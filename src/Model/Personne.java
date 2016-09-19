package Model;

public class Personne extends Contact {
	String prenom;
	
	public Personne() {
		super();
		prenom = "Aucun";
	}
	
	public Personne(String nom, String numTel, String email, String comment, String prenom) {
		super(nom, numTel, email, comment);
		this.prenom = prenom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String toString() {
		String toRet;
		
		toRet = "Nom : " + this.nom;
		toRet += "\nPrenom : " + this.prenom;
		toRet += "\nNumero de telephone : " + this.numTel;
		toRet += "\ne-mail : " + this.email;
		toRet += "\nCommentaire : " + this.comment;
		return (toRet);
	}
}
