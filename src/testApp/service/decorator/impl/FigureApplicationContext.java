package testApp.service.decorator.impl;


import testApp.model.SimpleFigureFactory;
import testApp.service.decorator.ApplicationContext;

public class FigureApplicationContext implements ApplicationContext {

    @Override
    public FigureFactoryDecorator createFactory() {
        return new PreProcessing(new PostProcessing(new SimpleFigureFactory()));
    }
}
