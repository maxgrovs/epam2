package testApp.service.decorator;

import testApp.service.decorator.impl.FigureFactoryDecorator;

public interface ApplicationContext {

    FigureFactoryDecorator createFactory();

}
