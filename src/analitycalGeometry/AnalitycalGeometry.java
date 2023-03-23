package analitycalGeometry;

import java.awt.geom.Point2D;

import analitycalGeometry.objects.Line;

public class AnalitycalGeometry {
	
	/**
	 * finds point located in between to different points 
	 * @param a - first point
	 * @param b - second point
	 * @return
	 */
	public static Point2D findMiddlePoint(Point2D a, Point2D b) {
		double x = a.getX();
		double y = a.getY();
		double delX = Math.abs(b.getX() - a.getX()) / 2;
		double delY = Math.abs(b.getY() - a.getY()) / 2;
		if (b.getX() > a.getX()) {
			x = a.getX() + delX;
		} else if (b.getX() < a.getX()) {
			x = b.getX() + delX;
		}
		if (b.getY() > a.getY()) {
			y = a.getY() + delY;
		} else if (b.getY() < a.getY()) {
			y = a.getY() + delY;
		}
		Point2D middlePoint = new Point2D.Double(x, y);
		return middlePoint;
	}
	/**
	 * calculates linear equation from two points
	 * @param a - first point
	 * @param b - second point
	 * @return line or null if points have the same x
	 */
	public static Line findLine(Point2D a, Point2D b) {
		if (a.getX() == b.getX()) {
			return null;
		}
//		finding parameter a
		double a1 =  (a.getY() - b.getY()) / (a.getX() - b.getY());
//		finding parameter b
		double b1 = (a.getY() - ((a.getY() - b.getY()) / (a.getX() - b.getX())) * a.getX());
		return new Line(a1, b1);
	}
	
	/**
	 * finds perpendicular line to the one that is given and is going thru the given point
	 * @param line1 - line perpendicular to the one that is being found
	 * @param a - one point that looked line is going thru
	 * @return - Line
	 */
	public static Line findPerpendicularLine(double[] line1, Point2D a) {
		double[] coefficients = new double[2];
		coefficients[0] = -1 / line1[0];
		coefficients[1] = a.getY() - coefficients[0] * a.getX();
		return new Line(coefficients[0], coefficients[1]);
	}
	
	/**
	 * checks is line is perpendicular to the other
	 * @param line1
	 * @param line2
	 * @return <code>true</code> if line perpendicular, <code>false</code> if line is not
	 */
	public static boolean isLinePerpendicular(double[] line1, double[] line2) {
		return (line1[0] * line2[0]) == -1;
	}
	
	public static double degree(Line l1, Line l2) {
		return Math.abs((l1.a() - l2.a()) / (1 + l1.a() * l2.a()));
	}
}
