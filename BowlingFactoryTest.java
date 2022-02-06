package bowling.tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import bowling.BowlingFactory;
import bowling.BowlingPackage;
import bowling.Game;
import bowling.League;
import bowling.Matchup;
import bowling.Player;
import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

public class BowlingFactoryTest extends TestSuite {
	public void testMatchupGameRef() {
		   Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
		   Game game = BowlingFactory.eINSTANCE.createGame();
		   matchup.getGames().add(game);
		   assertEquals(game.getMatchup(), matchup);
		}

	public void testReflection() {
			EObject eObject = BowlingFactory.eINSTANCE.createPlayer();
			eObject.eSet(BowlingPackage.eINSTANCE.getPlayer_Name(), "Jonas");
			Player player = (Player) eObject;
			assertEquals("Jonas", player.getName());
	}
	
	public void testReflectiveInformation() {
		   League league = BowlingFactory.eINSTANCE.createLeague();
		   assertTrue(league.eClass().getEAllReferences().get(0).isMany());
		   assertTrue(BowlingPackage.eINSTANCE.getLeague_Players().isMany());
		}
	
	public void testValidation() {
		   Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
		   matchup.getGames().add(BowlingFactory.eINSTANCE.createGame());
		   Diagnostic validate = Diagnostician.INSTANCE.validate(matchup);
		   assertEquals(Diagnostic.ERROR, validate.getSeverity());
		}
	
	public void testCopy() {
		   Player player = BowlingFactory.eINSTANCE.createPlayer();
		   player.setName("Jonas");
		   Player copy = EcoreUtil.copy(player);
		   assertNotSame(player, copy);
		   assertEquals(player.getName(), copy.getName());
		}

}

