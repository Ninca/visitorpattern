package cr.demo.visitorpattern;

import cr.demo.visitorpattern.model.A;
import cr.demo.visitorpattern.model.B;
import cr.demo.visitorpattern.model.Visitable;

public class DemoVisitor implements IVisitor {
	//  e.g. Exception to error code mapper - make sure you can't add a new Visitable without handling it here
	
	@Override
	public void visit(B b) {
		System.out.println("Forced implementation for B");
	}

	@Override
	public void visit(A a) {
		System.out.println("Forced to handle A");
	}

	public void meth(Visitable x) {
		x.visit(this);
	}
	
}


