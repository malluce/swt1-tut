package patterns.visitor;

public abstract class AbstractGarbage {
	abstract void accept(IGarbageVisitor visitor);

	public void takeGarbageOut() {
		System.out.println("Bringe den Müll raus");
	}
}
