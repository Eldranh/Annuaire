package Model;

public class Entreprise extends Contact {
	String siren;
	
	public Entreprise() {
		super();
		siren = "Inconnu";
	}
	
	public Entreprise(String nom, String numTel, String email, String comment, String siren) {
		super(nom, numTel, email, comment);
		this.siren = siren;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}
	
	public String toString() {
		String toRet;
		
		toRet = "Nom : " + this.nom;
		toRet += "\nNumero de telephone : " + this.numTel;
		toRet += "\ne-mail : " + this.email;
		toRet += "\nCommentaire : " + this.comment;
		toRet += "\nSIREN : " + this.siren;
		return (toRet);
	}
}
