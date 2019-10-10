package adressecucumber;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AbonneStatusTest {
	@Steps
    private AbonneStatusSteps abonneSteps;
 
    @Test
    public void testAbonneSansDateEffet() {
    	abonneSteps.unAbonneAvecUneAdressePrincipaleEnOf("inactive", "France");
    	abonneSteps.leConseillerConnecteAModifieAdresseDeAbonneOf("FACE", "sans date d'effet");
    	abonneSteps.adresseDeAbonneModifieeEstEnregistreeSurEnsembleDesContratsDeAbonne();
    	abonneSteps.unMouvementDeModificationEstCree();

    }
    
    @Test
    public void testAbonneAvecDateEffet() {
      	abonneSteps.unAbonneAvecUneAdressePrincipaleEnOf("active", "Pologne");
    	abonneSteps.leConseillerConnecteAModifieAdresseDeAbonneOf("EC", "avec date d'effet");
    	abonneSteps.adresseDeAbonneModifieeEstEnregistreeSurEnsembleDesContratsDeAbonne();
    	abonneSteps.unMouvementDeModificationEstCree();
    }
}
