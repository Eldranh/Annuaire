package Model;

public abstract class Contact implements Comparable<Contact> {

	String nom;
	String numTel;
	String email;
	String comment;
	
	public Contact() {
		nom = "Inconnu";
		numTel = "Aucun";
		email = "Aucun";
		comment = "Aucun";
	}
	
	public Contact(String nom, String numTel, String email, String comment) {
		this.nom = nom;
		this.numTel = numTel;
		this.email = email;
		this.comment = comment;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((numTel == null) ? 0 : numTel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numTel == null) {
			if (other.numTel != null)
				return false;
		} else if (!numTel.equals(other.numTel))
			return false;
		if (!this.getClass().equals(other.getClass()))
			return false;
		return true;
	}
	
	@Override public int compareTo(Contact other) {
		if (this.getClass().equals(other.getClass())) {
			if (!getNom().equals(other.getNom()))
				return (getNom().compareTo(other.getNom()));
			return (getNumTel().compareTo(other.getNumTel()));
		}
		if (this.getClass().equals(Personne.class)) return (1);
		return (-1);
	}
}
