package no.hvl.dat108;

public class Sirkel implements Flate {

	public double radius;
	public double areal() {
		return 2*Math.PI*Math.pow(radius, 2);
	}

	public Sirkel(double radius) {
		this.radius = radius;
	}

}
