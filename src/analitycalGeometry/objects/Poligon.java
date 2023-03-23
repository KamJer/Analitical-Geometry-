package analitycalGeometry.objects;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class Poligon {
	
	private List<Point2D.Double> points = new ArrayList<>();
	
	public Poligon(List<Point2D.Double> points) {
		this.points = points;
	}
	
	public Poligon(Point2D.Double[] points) {
		for (int i = 0; i < points.length; i++) {
			this.points.add(points[i]);
		}
	}
	
	public void contains(Point2D.Double point) {
		
	}

	public List<Point2D.Double> getPoints() {
		return points;
	}

	public void setPoints(List<Point2D.Double> points) {
		this.points = points;
	}
}
