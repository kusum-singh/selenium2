package Training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
		
		@Test
    public void testCase1() {
        int ExpLinks = 10;
        int ActLinks = 12; // selenium code
        System.out.println("A");
        try {
        Assert.assertEquals(ActLinks, ExpLinks);
        }catch(Throwable t) {
        System.out.println(t.getMessage());
        }
        System.out.println("B");
    }
	
}
