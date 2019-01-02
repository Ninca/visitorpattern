package cr.demo.visitorpattern.model;

import cr.demo.visitorpattern.IVisitor;

public class B extends Visitable {

	@Override
	public void visit(IVisitor visitor) {
		visitor.visit(this);
		
	}

}
