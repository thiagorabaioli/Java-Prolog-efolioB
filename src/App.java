
import org.jpl7.*;

public class App {
    public static void main(String[] args) throws Exception {
       

        Query q1 = 
    new Query( 
	"consult", 
	new Term[] {new Atom("src/test.pl")} 
    );

    System.out.println( "consult " + (q1.hasSolution() ? "succeeded" : "failed"));

    }
}
