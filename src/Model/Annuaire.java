package Model;

import java.util.Iterator;
import java.util.TreeSet;

public class Annuaire {
	TreeSet<Contact> contacts;

	public Annuaire() {
		contacts = new TreeSet<Contact>();
		
		/* ajoute les contactes du xml */
		contacts.add(new Personne());
		contacts.add(new Personne("Xavier", "0693 55 46 20", "babtout@wanadoo.fr", "Il se passe des choses bizarre dans ma tête", "Charles"));
		contacts.add(new Entreprise("Bisounours Inc.", "0692 666 999", "admin@bisounours-inc.cz", "Acheter des bisous, ce n'est pas de la prostitution !", "552 100 554"));
		contacts.add(new Personne("Zibouda", "0693 32 20 28", "zibouda@univ-reunion.fr", "Qui peut bien s'appeler ainsi ?", "Zoulou"));
		contacts.add(new Entreprise("Astra corp.", "0692 1234 56", "astra@gmail.com", "Ad Astra ! Lux phenomenon", "486 123 794"));
		contacts.add(new Entreprise());
	}
	
	public String toString() {
		String toRet = "";
		Iterator<Contact> it = contacts.iterator();
		
		while (it.hasNext())
		   toRet += it.next() + "\n\n";
		return (toRet);
	}
}
