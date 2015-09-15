
import junit.framework.TestCase;


public class Test_pt2 extends TestCase {
    public void Test_delta(){
        ptb2 a = new ptb2(1,2,1);
        assertEquals(0, a.delta()); 
        a= new ptb2(1,3,2);
        assertEquals(1, a.delta());
    }
    public void Test_x12(){
        ptb2 a = new ptb2(1,2,1);
        assertEquals("phuong trinh co 1 nghiem x=" + -1, a.x12());
        a= new ptb2(1,3,2);
        assertEquals("phuong trinh co 2 nghiem x1=" + 1 +" x2=" +2, a.delta());
    }
}
