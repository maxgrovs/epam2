package lectures.task_0.app;

import lectures.task_0.model.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static Logger logger = LogManager.getLogger("main");

    public static void main(String[] args) {

        Point[] points = collectPoint(new Point(3, 7), new Point(0, 10));

        writeLog(points);

    }

    public static Point[] collectPoint(Point... input) {
        Point[] points;
        points = new Point[input.length];

        int i = 0;
        for (Point point : input) {
            points[i] = point;
            i++;
        }

        return points;
    }

    public static void writeLog(Point[] points) {

        for (Point point :
                points) {
            logger.info(point.toString());
        }

    }


}
