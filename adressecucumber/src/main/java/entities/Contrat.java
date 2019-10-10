package entities;

public class Contrat {

	private Integer idContrat;
	private String  nomContrat;
	private Abonne abonne;
	private String adresse;
	public Integer getIdContrat() {
		return idContrat;
	}
	public void setIdContrat(Integer idContrat) {
		this.idContrat = idContrat;
	}
	public String getNomContrat() {
		return nomContrat;
	}
	public void setNomContrat(String nomContrat) {
		this.nomContrat = nomContrat;
	}
	public Abonne getAbonne() {
		return abonne;
	}
	public void setAbonne(Abonne abonne) {
		this.abonne = abonne;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
	
}
