package analitycalGeometry.objects;

public class Line {
	private double a;
	private double b;
	
	public Line(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double findX(double y) {
		return (y - b) / a;
	}
	
	public double findY(double x) {
		return a*x + b;
	}
	
	public double a() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double b() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
}
