package lesson5.lecture.intfaces2;


import lesson5.lecture.intfaces2.Circle;
import lesson5.lecture.intfaces2.EQTriangle;
import lesson5.lecture.intfaces2.Ellipse;
import lesson5.lecture.intfaces2.Rectangle;
import lesson5.lecture.intfaces2.ClosedCurve;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
	List<ClosedCurve> objects = new ArrayList<>();

	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		dm.objects.add(new Rectangle(5, 7));
		dm.objects.add(new Rectangle(2, 9));
		dm.objects.add(new Circle(6));
		dm.objects.add(new Circle(5));
		dm.objects.add(new Ellipse(2, 5));
		dm.objects.add(new Ellipse(6, 4));
		dm.objects.add(new EQTriangle(4));
		dm.objects.add(new EQTriangle(5));
		System.out.println("Average Perimeter: " + dm.computeAveragePerimeter());
	}


	public double computeAveragePerimeter() {
		if (objects == null || objects.isEmpty()) return 0.0;
		double sum = 0.0;
		for (int i = 0; i < objects.size(); ++i) {
			double perimeter = objects.get(i).computePerimeter();
			System.out.println("Object " + (i + 1) + "Type: " + objects.get(i).getClass().getSimpleName() + ", Perimeter: " + perimeter);
			sum += perimeter;
		}
		return sum / objects.size();
	}

}
