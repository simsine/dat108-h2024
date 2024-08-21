package no.hvl.dat108.collsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//1. Sortere i "naturlig" rekkefølge i hht. String compareTo. OK
		List<String> listen = Arrays.asList("Hallo", "blabla", "knut", "Per");
		Collections.sort(listen);
		System.out.println(listen);
		
		//2. Sortere alfabetisk uavhengig av store og små bokstaver
		Collections.sort(listen, (o1, o2) -> o1.compareToIgnoreCase(o2));
		System.out.println(listen);
		
		//3. ..., nå med lambda-uttrykk !!! :)
		System.out.println(listen);
		
		//4. Sortere på lengden på strengene (med lambda-uttrykk)
		Collections.sort(listen, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
		System.out.println(listen);
		
		//5. Sortere på lengden synkende. Putte lambda-uttrykk inn i variabel.
		Comparator<String> lengdeSynkende = (o1,o2) -> Integer.compare(o2.length(), o1.length());
		Collections.sort(listen, lengdeSynkende);
		System.out.println(listen);
	}
}

