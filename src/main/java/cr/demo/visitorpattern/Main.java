package cr.demo.visitorpattern;

import cr.demo.visitorpattern.model.A;
import cr.demo.visitorpattern.model.B;
import cr.demo.visitorpattern.model.Visitable;

public class Main {

	public static void main(String[] args) {
		Visitable childA = new A();
		Visitable childB = new B();
		
		sharedMethod(childA);
		sharedMethod(childB);
	}

	private static void sharedMethod(Visitable x) {
		System.out.println("Got " + x);
		
		// Showing how a visitor is implemented typically (based on dynamic method dispatch)
		DemoVisitor demoVisitor = new DemoVisitor();
		demoVisitor.meth(x);
		
		// Another use case 
		// As there is no multiple dispatch like in C# with "dynamic" an alternative to instanceof is using a Visitor:
		x.visit(new IVisitor() {
			
			@Override
			public void visit(A childA) {
				specificMethod(childA);
			}
			
			@Override
			public void visit(B childB) {
				specificMethod(childB);
				
			}
		});
	}

	private static void specificMethod(A childA) {
		System.out.println("Specific logic for parameter A");
	}
	
	private static void specificMethod(B childB) {
		System.out.println("Specific logic for parameter B");
	}
	
	

}
