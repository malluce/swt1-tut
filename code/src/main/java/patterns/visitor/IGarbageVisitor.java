package patterns.visitor;

public interface IGarbageVisitor {
	void visitGlasGarbage(GlasGarbage gg);

	void visitPaperGarbage(PaperGarbage pg);
}
