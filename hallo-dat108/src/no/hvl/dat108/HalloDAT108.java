package no.hvl.dat108;

public class HalloDAT108 {
	
	public static void main(String[] args) {
		Flate s1 = new Sirkel(2.0);
		System.out.println(s1.areal());
		
		Skapning katt = new Skapning() {
			
			@Override
			public void siHei() {
				System.out.println("Mjau");
				
			}
		};
		katt.siHei();
	}

}
