package newTask.com.epam.jwd.view;

import newTask.com.epam.jwd.model.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PointLogic {

    private static Logger logger = LogManager.getLogger(PointLogic.class);

    public void print(Point[] points) {
        int i = 0;

        do {
            logger.info(points[i++].toString());
        } while (i < points.length);
    }

    public double calculateDistanceBetweenPoints(Point a, Point b) {

        double ac = Math.abs(b.getY() - a.getY());
        double cb = Math.abs(b.getX() - a.getX());

        return Math.hypot(ac, cb);
    }

}
