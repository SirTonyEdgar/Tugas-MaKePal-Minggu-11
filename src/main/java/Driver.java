import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {

		Counter counter = new Counter();

		System.out.println("Counter Sekarang:" + counter.getCount());

		counter.increment();

		System.out.println("Counter Sekarang:" + counter.getCount());

		counter.decrement();

		System.out.println("Counter Sekarang:" + counter.getCount());

	}

}
