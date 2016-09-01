package handoutexamples;

public class PayrollDriver {
    public static void main(String[] args) {
        //test setup
        Payroll p = new Payroll();

        //test case 1
        p.setEmployees(new String[]{"E001", "E002"});
        print("Test 1 output " + p.totalSalary());

        //test case 2
        p.setEmployees(new String[]{"E001"});
        print("Test 2 output " + p.totalSalary());

        //more tests
        System.out.println("Testing completed");
    }

	private static void print(String string) {
		// TODO Auto-generated method stub
		
	}

}

