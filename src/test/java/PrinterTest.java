import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void setUp(){
        printer = new Printer(20,18);
    }

    @Test
    public void hasPaper(){
        assertEquals(20,printer.getPaper());
    }

    @Test
    public void willPrintIfEnoughPaper(){
        printer.print(3,4);
        assertEquals(8,printer.getPaper());
    }

    @Test
    public void willNotPrintIfNotEnoughPaper(){
        printer.print(3,7);
        assertEquals(20,printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(18,printer.getToner());
    }

    @Test
    public void usesToner(){
        printer.print(1,7);
        assertEquals(11,printer.getToner());
    }

    @Test
    public void willNotPrintIfNotEnoughToner(){
        Printer printer2 = new Printer(100,10);
        printer2.print(8,2);
        assertEquals(10, printer2.getToner());
    }

}
