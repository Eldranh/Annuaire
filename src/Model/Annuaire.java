package Model;

import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.TreeSet;
import org.jdom2.*;
import org.jdom2.output.*;

public class Annuaire {
	TreeSet<Contact> contacts;
	Element saveTree;

	public Annuaire() {
		contacts = new TreeSet<Contact>();
		
		/* ajoute les contactes du xml */
		contacts.add(new Personne());
		contacts.add(new Personne("Xavier", "0693 55 46 20", "babtout@wanadoo.fr", "Il se passe des choses bizarre dans ma tête", "Charles"));
		contacts.add(new Entreprise("Bisounours Inc.", "0692 666 999", "admin@bisounours-inc.cz", "Acheter des bisous, ce n'est pas de la prostitution !", "552 100 554"));
		contacts.add(new Personne("Zibouda", "0693 32 20 28", "zibouda@univ-reunion.fr", "Qui peut bien s'appeler ainsi ?", "Zoulou"));
		contacts.add(new Entreprise("Astra corp.", "0692 1234 56", "astra@gmail.com", "Ad Astra ! Lux phenomenon", "486 123 794"));
		contacts.add(new Entreprise());
		contacts.add(new Entreprise("Github entreprise", "0692 534 096", "eldranh@github.com", "Test de github", "337 425 918"));

	}
	
	public String toString() {
		String toRet = "";
		Iterator<Contact> it = contacts.iterator();
		
		while (it.hasNext())
		   toRet += it.next() + "\n\n";
		return (toRet);
	}
	
	private void buildContact(Element contact, Contact toSave) {
		boolean isPersonne = toSave.getClass() == Personne.class;
		Element attr;
		Attribute type = new Attribute("type", isPersonne ? "Personne" : "Entreprise");
		
		// Sauvegarde du nom
		contact.setAttribute(type);
		attr = new Element("nom");
		attr.setText(toSave.getNom());
		contact.addContent(attr);
		
		// Sauvegarde d'email
		contact.setAttribute(type);
		attr = new Element("email");
		attr.setText(toSave.getEmail());
		contact.addContent(attr);

		// Sauvegarde du numéro de téléphone
		contact.setAttribute(type);
		attr = new Element("numTel");
		attr.setText(toSave.getNumTel());
		contact.addContent(attr);

		// Sauvegarde du commentaire
		contact.setAttribute(type);
		attr = new Element("comment");
		attr.setText(toSave.getComment());
		contact.addContent(attr);

		// Sauvegarde de l'info supplémentaire
		contact.setAttribute(type);
		attr = new Element(isPersonne ? "prenom" : "siren");
		if (isPersonne)
			attr.setText(((Personne)toSave).getPrenom());
		else
			attr.setText(((Entreprise)toSave).getSiren());
		contact.addContent(attr);
	}
	
	private void buildSaveTree() {
		Iterator<Contact> it = contacts.iterator();
		Contact toSave;
		Element contact;
		
		saveTree = new Element("Annuaire");
		while (it.hasNext()) {
			toSave = it.next();
			contact = new Element("Contact");
			saveTree.addContent(contact);
			buildContact(contact, toSave);
		}
	}
	
	public void enregistre() {
		try
		{
			buildSaveTree();
			XMLOutputter sortie = new XMLOutputter(Format.getCompactFormat());
			sortie.output(saveTree, new FileOutputStream("save.xml"));
		}
		catch (java.io.IOException e){} }
}
