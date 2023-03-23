package analitycalGeometry.objects;

import java.math.BigDecimal;

public class Point <T extends Number> {
	
	private T x;
	private T y;
	
	public Point(T a, T b) {
		this.x = a;
		this.y = b;
	}
	
	/**
	 * returns distance in straight line from this point to the passed one
	 * @param point - point to witch distance is measured to
	 * @return
	 */
	public double getDistance(Point<T> point) {
		double dX = Math.abs(new BigDecimal(point.getX().toString()).subtract(new BigDecimal(this.getX().toString())).doubleValue());
		double dY = Math.abs(new BigDecimal(point.getY().toString()).subtract(new BigDecimal(this.getY().toString())).doubleValue());
		return Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + " , " + y + ")";
	}
}
