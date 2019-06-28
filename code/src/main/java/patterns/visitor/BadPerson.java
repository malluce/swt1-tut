package patterns.visitor;

public class BadPerson implements IGarbageVisitor {

	@Override
	public void visitGlasGarbage(GlasGarbage gg) {
		System.out.println("geht nicht");

	}

	@Override
	public void visitPaperGarbage(PaperGarbage pg) {
		pg.setOnFire();
		System.err.println("hehe");

	}

}
