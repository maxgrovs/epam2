package newTask.com.epam.jwd.service.decorator;

import newTask.com.epam.jwd.model.Figure;

public interface ApplicationContext {

    FigureFactoryDecorator createFactory();

}
