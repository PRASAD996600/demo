package maven_project.maven_app;

/**
 * Hello world!
 *
 */
public class App {


	public static void main(String[]args){
		
		calculator calc = new calculator(10,20);
		
		System.out.println(calc.add());
		System.out.println(calc.substraction());	
		System.out.println(calc.divide());
		System.out.println(calc.multiplication());
    		
    		}

    
    }

