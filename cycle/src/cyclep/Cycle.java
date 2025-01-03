package cyclep;

public interface Cycle {

	void start();
	void stop();
	default void foo() {
		System.out.println("foo");
	}
}
