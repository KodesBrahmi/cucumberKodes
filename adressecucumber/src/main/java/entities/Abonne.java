package entities;

import java.util.ArrayList;
import java.util.List;


public class Abonne {
	

    private Integer idAbonne;
    private String nom;
    private String active;
    private String pays;
    private String adresse;
    private String date_effet;
    
    private List<Contrat> contrats = new ArrayList<Contrat>();
    
    public void modifierAdresse(String nouvelleAdresse) {
        this.adresse = nouvelleAdresse ;
        for(int i=0; i< contrats.size(); i++){
        	contrats.get(i).setAdresse(nouvelleAdresse);
        }
    }
    
    
	public Integer getIdAbonne() {
		return idAbonne;
	}
	public void setIdAbonne(Integer idAbonne) {
		this.idAbonne = idAbonne;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getDate_effet() {
		return date_effet;
	}
	public void setDate_effet(String date_effet) {
		this.date_effet = date_effet;
	}
	public List<Contrat> getContrats() {
		return contrats;
	}
	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}
    
    public void creerMvt() {
    }

}
