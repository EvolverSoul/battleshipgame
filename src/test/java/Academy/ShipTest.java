package Academy;

import static org.junit.Assert.assertTrue;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ShipTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    // Al's Test
    @Test
    public void addsNorthSouthShip(){
        Assertions.assertThat(ships).contains(shipAdded);
    }
}
