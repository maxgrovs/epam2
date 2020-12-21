package homeWork.task_3.com.epam.jwd.service.decorator;

import homeWork.task_3.com.epam.jwd.model.Figure;

public interface ApplicationContext {

    FigureFactoryDecorator createFactory();

}
