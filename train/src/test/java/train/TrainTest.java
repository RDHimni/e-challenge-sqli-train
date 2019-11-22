package train;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TrainTest {
		
    @Test
    public void passengerTrain() {
        Train train = new Train("HPP");
        System.out.println(train.print());
        assertEquals("<HHHH::|OOOO|::|OOOO|", train.print());
    }

    @Test
    public void restaurantTrain() {
        Train train = new Train("HPRP");
        System.out.println(train.print());

        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|", train.print());
    }

    @Test
    public void doubleHeadedTrain() {
        Train train = new Train("HPRPH");
        System.out.println(train.print());
        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|::HHHH>", train.print());
    }

    @Test
    public void modifyTrain() {
        Train train = new Train("HPRPH");
        train.detachEnd();
        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|", train.print());
        train.detachEnd();
        assertEquals("|OOOO|::|hThT|::|OOOO|", train.print());
    }

    
    
    
    
    @Test
    public void cargoTrain() {
        Train train = new Train("HCCC");
        assertEquals("<HHHH::|____|::|____|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|^^^^|::|____|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|^^^^|::|^^^^|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|^^^^|::|^^^^|::|^^^^|", train.print());
        assertFalse(train.fill());
    }

    @Test
    public void mixedTrain() {
        Train train = new Train("HPCPC");
        assertEquals("<HHHH::|OOOO|::|____|::|OOOO|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|OOOO|::|^^^^|::|OOOO|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|OOOO|::|^^^^|::|OOOO|::|^^^^|", train.print());
        assertFalse(train.fill());
    }
}
