package homeWork.task_3.com.epam.jwd.service.decorator;

import homeWork.task_3.com.epam.jwd.model.SimpleFigureFactory;

public class FigureApplicationContext implements ApplicationContext {

    @Override
    public FigureFactoryDecorator createFactory() {
        return new PreProcessing(new PostProcessing(new SimpleFigureFactory()));
    }
}
