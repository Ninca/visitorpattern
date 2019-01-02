package cr.demo.visitorpattern;

import cr.demo.visitorpattern.model.A;
import cr.demo.visitorpattern.model.B;

public interface IVisitor {

	void visit(B childB);

	void visit(A childA);

}

