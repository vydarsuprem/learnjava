package conditionalStatements;

public class IfStatement {

	public static void main(String[] args) {
		boolean cond1 = true;
		boolean cond2 = false;
		
		System.out.print("Direct : ");
		if(cond1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println();
		System.out.print("InDirect : ");
		if(!cond1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}

}
