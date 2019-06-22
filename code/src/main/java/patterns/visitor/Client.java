package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {

		List<AbstractGarbage> trashCan = new ArrayList<>();
		trashCan.add(new GlasGarbage());
		trashCan.add(new PaperGarbage());

		IGarbageVisitor visitor = new RecycleVisitor();

		for (AbstractGarbage garbage : trashCan) {
			garbage.accept(visitor);
		}

	}

}
