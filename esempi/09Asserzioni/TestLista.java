import junit.framework.TestCase;
import linkedList.List;

public class TestLista extends TestCase {
  
	public void testSize(){
		List l = new List();
		//List l = null;
		
		assertEquals(0,l.size());
		
		l.insert(1);
		l.insert(1);

		assertEquals(2,l.size());
	}
}
