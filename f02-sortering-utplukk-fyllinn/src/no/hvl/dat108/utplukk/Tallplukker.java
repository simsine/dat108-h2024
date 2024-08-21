package no.hvl.dat108.utplukk;

import java.util.ArrayList;
import java.util.List;

public class Tallplukker {

	public static List<Integer> plukkUt(List<Integer> liste, Condition condition) {
		
		List<Integer> svar = new ArrayList<Integer>();
		for(int tall : liste) {
			if(condition.check(tall)) { //Denne linjen
				svar.add(tall);
			}
		}
		return svar;
	}
}

interface Condition {
	boolean check(int tall);
}