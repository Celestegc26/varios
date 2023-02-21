package principal;

import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		List<Integer> lista = List.of(3,6,2,11,6,3,8,90,16,34,2,11);
		lista.parallelStream()
		.peek(System.out::println)
		.sequential()
		.anyMatch(n->n>10);
	}

}