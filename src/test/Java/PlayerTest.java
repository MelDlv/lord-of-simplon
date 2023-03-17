import fr.simplon.lordofsimplon.api.heroes.IHeroe;
import fr.simplon.lordofsimplon.api.player.Player;
import fr.simplon.lordofsimplon.impl.heroes.Heroe;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    IHeroe Capybara;
    Player CapyPlayer;
    
    @BeforeEach
    void initialisation() {
        Capybara = new Heroe("Paladin", "Paladin.png");
        CapyPlayer = new Player(Capybara,"Capy", 20);
    }
    
    @Test
    public void TestgetHeroe() {
        assertEquals( Capybara, CapyPlayer.getHeroe());
    }
    
    @AfterEach
    void fin(){
        Capybara = null;
        CapyPlayer = null;
    }
}