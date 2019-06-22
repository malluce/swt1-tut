package patterns.visitor;

public class PaperGarbage extends AbstractGarbage {

	public void setOnFire() {
		System.err.println("Das Altpapier brennt, Hilfe!");
	}

	@Override
	public void accept(IGarbageVisitor visitor) {
		visitor.visitPaperGarbage(this);
	}

}
