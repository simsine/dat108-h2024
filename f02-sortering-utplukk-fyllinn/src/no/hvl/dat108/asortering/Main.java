package no.hvl.dat108.asortering;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		//1. Sortere liste av heltall. OK
		List<Integer> listeAvTall = Arrays.asList(4,2,7,5,9,1);
		Utvalgssortering.sorter(listeAvTall);
		System.out.println("Sortert listeAvTall: " + listeAvTall);
		
				
		//2. Sortere liste av strenger. 
		List<String> listeAvString = Arrays.asList("Aaa", "Xxx", "Bbb", "Kkk");
		Utvalgssortering.sorter(listeAvString);
		System.out.println("Sortert listeAvString: " + listeAvString);
		
		
		//3. Sortere liste av personer på etternavn.
		List<Person> listeAvPersoner = Arrays.asList(
				new Person("Anne", "Persen", 1985),
				new Person("Per", "Andersen", 1984),
				new Person("Knut", "Svensen", 1990));
		
		Collections.sort(listeAvPersoner, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return o1.etternavn().compareTo(o2.etternavn());
			}
		});
		System.out.println("Sortert på etternavn: " + listeAvPersoner);
		
		
		//4. Ønsker å sortere på fornavn. Hva gjør vi?
		Collections.sort(listeAvPersoner, (o1, o2) -> o1.fornavn().compareTo(o2.fornavn()));
		System.out.println("Sortert på fornavn:   " + listeAvPersoner);
		
		
		//5. Ønsker å sortere på fødselsår. Hva gjør vi?
		//??? NÅ BEGYNNER DET NYE!
		Collections.sort(listeAvPersoner, (o1, o2) -> o1.fodselsaar().compareTo(o2.fodselsaar()));
		System.out.println("Sortert på fødselsår: " + listeAvPersoner);
		
	}
}

