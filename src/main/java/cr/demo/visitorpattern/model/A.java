package cr.demo.visitorpattern.model;
//package cr.visitorpattern.model;

import cr.demo.visitorpattern.IVisitor;

public class A extends Visitable {

	@Override
	public void visit(IVisitor visitor) {
		visitor.visit(this);
		
	}

}
