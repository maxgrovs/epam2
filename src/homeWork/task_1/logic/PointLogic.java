package homeWork.task_1.logic;

import homeWork.task_0.model.Point;
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

}
