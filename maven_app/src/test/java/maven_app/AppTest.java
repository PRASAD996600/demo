package maven_app;
import static org.junit.Assert.*;
import org.junit.Test; 
import org.junit.Assert; 
import org.junit.Before;
import maven_project.maven_app.calculator;
/**
 * Unit test for simple App.
 */
public class AppTest{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }

    @Test
        public void testadd(){
        calculator calc = new calculator(10,20);
        assert(30, calc.add());
        assert(-10, calc.substract());
        assert(0.5, calc.divide());
        assert(200, calc.multiplication());
        }

	
		
	
        
        
        
        
    }  

