package cr.demo.visitorpattern.model;

import cr.demo.visitorpattern.IVisitor;

public abstract class Visitable{
	
	public abstract void visit(IVisitor visitor);

}
