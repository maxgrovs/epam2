package newTask.com.epam.jwd.service.decorator;

import newTask.com.epam.jwd.model.SimpleFigureFactory;

public class FigureApplicationContext implements ApplicationContext {

    @Override
    public FigureFactoryDecorator createFactory() {
        return new PreProcessing(new PostProcessing(new SimpleFigureFactory()));
    }
}
