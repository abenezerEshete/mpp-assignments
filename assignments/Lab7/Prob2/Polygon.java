package lesson5.lecture.intfaces2;
import java.util.List;
public interface Polygon extends ClosedCurve{
        @Override
        default double computePerimeter() {
            List<Double> sides = getLengths();
            double sum = 0.0;
            for (Double side : sides) {
                sum += side;
            }
            return sum;
        }


    List<Double> getLengths();
    }

