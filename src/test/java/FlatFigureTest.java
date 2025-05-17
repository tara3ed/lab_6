import blogic.FlatFigure;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FlatFigureTest {
    
    public FlatFigureTest() {
    }
    @Test
    public void testRTriangle() {
        double a = 2;
        double b = 4;
        double expResult = 4.0;
        FlatFigure ff=new FlatFigure(a, b, 90);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }
    @Test
    public void testTriangle() {
        double a = 4;
        double b = 3;
        double c = 5;
        double expResult = 6.0;
        FlatFigure ff=new FlatFigure(a, b, c);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    } 
    @Test
    public void testTriangle3() {
        double a = 4;
        double b = 8;
        double c = 5;
        double expResult = 8.181534;
        FlatFigure ff=new FlatFigure(a, b, c);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }
    @Test
    public void testSquare() {
        double a = 4;
        double expResult = 16.0;
        FlatFigure ff=new FlatFigure(a,90);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }  
    @Test
    public void testRomb() {
        double a = 4;
        double expResult = 8.0;
        FlatFigure ff=new FlatFigure(a,30);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }    
    @Test
    public void testRect() {
        double a = 4;
        double b = 8;
        double expResult = 32.0;
        FlatFigure ff=new FlatFigure(a,b,90,90);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }
    @Test
    public void testParal() {
        double a = 4;
        double b = 8;
        double expResult = 16.0;
        FlatFigure ff=new FlatFigure(a,b,30,150);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }
}
