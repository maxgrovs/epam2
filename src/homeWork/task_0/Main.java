package homeWork.task_0;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static Logger logger = LogManager.getLogger("main");

    public static void main(String[] args) {


        logger.info("Hi I am in main!");

        logTest();

    }

    public static void logTest() {
        logger.error("ERROR!!!!");
    }

}
