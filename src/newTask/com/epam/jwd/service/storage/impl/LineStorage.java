package newTask.com.epam.jwd.service.storage.impl;

import newTask.com.epam.jwd.model.Line;
import newTask.com.epam.jwd.service.storage.FigureStorage;

import java.util.List;
import java.util.Objects;

public class LineStorage implements FigureStorage {

    private List<Line> lines;

    public LineStorage(List<Line> lines) {
        this.lines = lines;
    }

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineStorage that = (LineStorage) o;
        return Objects.equals(lines, that.lines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lines);
    }

    @Override
    public String toString() {
        return "LineStorage{" +
                "lines=" + lines +
                '}';
    }
}
