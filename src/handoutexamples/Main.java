package handoutexamples;

public class Main {
	
	int count;
	
	public void useExceptionsForFlowControl() {
	    try {
	        while (true) {
	            increaseCount();
	        }
	    } catch (MaximumCountReachedException ex) {
	    }
	    //Continue execution
	}
	

	public void increaseCount()  throws MaximumCountReachedException {
	    if (count >= 5000){
	        throw new MaximumCountReachedException();
	    }
	}
	
	class MaximumCountReachedException extends Throwable{
		
	}
	
	void temp(){
		PGStudent pgs = new PGStudent();
		String name = pgs.getName();
		
		Student s = new PGStudent();
		
		Student ugs = new UGStudent();
		GradeCalculator.calculate(ugs);
	}


}

interface Graded{
	public String getName();
	public double getCAP();
}

interface Payee{
	public String getNationality();
}

class Student implements Graded, Payee{
    String name;
    String nationality;
    double cap;
	
    @Override
	public String getName(){
		return name;
	}
	
	@Override
	public String getNationality(){
		return nationality;
	}
	
	@Override
	public double getCAP(){
		return cap;
	}
	
}

class GradeCalculator{
	
	static void calculate(Graded g){
		//...
	}
}

class UGStudent extends Student{
	
}

class PGStudent extends Student{
	void printName(){
		System.out.println(getName());
	}
	
}

