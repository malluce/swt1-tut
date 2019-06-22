package patterns.visitor;

public class GlasGarbage extends AbstractGarbage {

	@Override
	public void accept(IGarbageVisitor visitor) {
		visitor.visitGlasGarbage(this);
	}

}
