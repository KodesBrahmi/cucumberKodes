package adressecucumber;
import net.thucydides.core.annotations.Step;
import cucumber.api.PendingException;  
 
import entities.Abonne;
public class AbonneStatusSteps {
	
	private Abonne abonne;
	private String conditionAbonne;
	private String nvadresse ="Paris";
	private String date_effet = "20/10/2019";

	    @Step("Given un abonne avec une adresse principale {0} en {1}")
	    public void unAbonneAvecUneAdressePrincipaleEnOf(String active, String pays) {
	    	abonne = new Abonne();
	        abonne.setActive(active);
	        abonne.setPays(pays);
	    }
	    @Step("When le conseiller connecte a {0} modifie adresse de abonne {1}")
	    public void leConseillerConnecteAModifieAdresseDeAbonneOf(String canal, String condition) {
         conditionAbonne = condition;
	    }
	    @Step("Then adresse de abonne modifiee est enregistree sur ensemble des contrats de abonne")
	    public void adresseDeAbonneModifieeEstEnregistreeSurEnsembleDesContratsDeAbonne() {
	    	abonne.modifierAdresse(nvadresse);
           
	    }
	    
	    @Step("And un mouvement de modification est cree")
	    public void unMouvementDeModificationEstCree() {
	    	if(conditionAbonne.equals("avec date d'effet")){
	    		abonne.setDate_effet(date_effet);
	    	}
	    	abonne.creerMvt();
    }
		public Abonne getAbonne() {
			return abonne;
		}
		public void setAbonne(Abonne abonne) {
			this.abonne = abonne;
		}
		public String getConditionAbonne() {
			return conditionAbonne;
		}
		public void setConditionAbonne(String conditionAbonne) {
			this.conditionAbonne = conditionAbonne;
		}
		public String getNvadresse() {
			return nvadresse;
		}
		public void setNvadresse(String nvadresse) {
			this.nvadresse = nvadresse;
		}
		public String getDate_effet() {
			return date_effet;
		}
		public void setDate_effet(String date_effet) {
			this.date_effet = date_effet;
		}
	    
	    
	}