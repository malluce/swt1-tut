package patterns.visitor;

public class RecycleVisitor implements IGarbageVisitor {

	@Override
	public void visitGlasGarbage(GlasGarbage gg) {
		System.out.println("Schmelze Glas-M�ll ein");
		// ..
	}

	@Override
	public void visitPaperGarbage(PaperGarbage pg) {
		System.out.println("Entferne Druckfarbe aus Altpapier");
		// ..
	}

}
