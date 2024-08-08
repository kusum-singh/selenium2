package Training;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {

	@Test
    public void testCase1() {
        int ExpLinks=10;
        int ActLinks=12;
        SoftAssert st=new SoftAssert();
        System.out.println("A");
        st.assertEquals(ActLinks,ExpLinks,"comparing number of links");
        st.assertEquals("Bangalore","Bengaluru","comparing two strings");
        System.out.println("B");
        st.assertAll();
        System.out.println("C");
    }

}
