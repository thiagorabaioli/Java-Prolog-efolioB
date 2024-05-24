
import org.jpl7.*;

public class App {
    public static void main(String[] args) throws Exception {
       

        Query q1 = 
    new Query( 
	"consult", 
	new Term[] {new Atom("src/test.pl")} 
    );

    System.out.println( "consult " + (q1.hasSolution() ? "succeeded" : "failed"));
   
    //child_of(joe,ralf)
    Query q2 = 
  new Query( 
      "child_of", 
      new Term[] {new Atom("joe"),new Atom("ralf")} 
  );

  System.out.println( 
  "child_of(joe,ralf) is " + 
  ( q2.hasSolution() ? "provable" : "not provable" ) 
);

    }
}
