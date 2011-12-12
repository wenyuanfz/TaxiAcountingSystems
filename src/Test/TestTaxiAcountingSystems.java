package Test;

import com.thoughtworks.TaxiAcountingSystems;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: 9527
 * Date: 11-12-12
 * Time: 下午5:12
 * To change this template use File | Settings | File Templates.
 */
public class TestTaxiAcountingSystems {
    TaxiAcountingSystems tas;

    @Before
    public void setUp() throws Exception {
        tas = new TaxiAcountingSystems();
    }

    @Test
    public void testLessThanStartDistance() throws Exception {
        assertEquals(6.0, tas.calculateExpense(2.5));
    }

    @Test
    public void testStartAcount() {
        assertEquals(6.0, tas.calculateExpense(3.0));
    }

    @Test
    public void testNoDistance() {
        assertEquals(0.0, tas.calculateExpense(0.0));
    }

    @Test
    public void testErrorInput() {
        assertEquals(-1.0, tas.calculateExpense(-23));
    }

    @Test
    public void testTotalAcount() {
        assertEquals(16.6, tas.calculateExpense(8.3));
    }

    @Test

    public void testTotalAcountAgain() {
        assertEquals(21.0, tas.calculateExpense(10.5));
    }
}
