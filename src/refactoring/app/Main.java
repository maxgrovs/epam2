package refactoring.app;

import refactoring.factory.Factory;
import refactoring.factory.TriangleFactory;

public class Main {

    private static Application configureApplication(){

        Application application;
        Factory factory;

        if (true){

            factory = new TriangleFactory();

            application = new Application(factory);

        }

        return application;
    }

    public static void main(String[] args) {

        Application application = configureApplication();

        application.getPoints();


    }
}
