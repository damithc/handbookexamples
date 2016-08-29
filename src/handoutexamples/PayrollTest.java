package handoutexamples;

import static org.junit.Assert.*;

import org.junit.Test;

public class PayrollTest {

    @Test
    public void testTotalSalary(){
        Payroll p = new Payroll();

        //test case 1
        p.setEmployees(new String[]{"E001", "E002"});
        assertEquals(p.totalSalary(), 6400);

        //test case 2
        p.setEmployees(new String[]{"E001"});
        assertEquals(p.totalSalary(), 2300);

        //more tests...
    }
}
