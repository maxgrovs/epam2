package newTask.com.epam.jwd.service.storage;

import newTask.com.epam.jwd.model.Triangle;


import java.util.List;
import java.util.Objects;

public class TriangleStorage {

    public TriangleStorage() {
    }

    private List<Triangle> triangles;

    public TriangleStorage(List<Triangle> triangles) {
        this.triangles = triangles;
    }

    public List<Triangle> getTriangles() {
        return triangles;
    }

    public void setTriangles(List<Triangle> triangles) {
        this.triangles = triangles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TriangleStorage that = (TriangleStorage) o;
        return Objects.equals(triangles, that.triangles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triangles);
    }

    @Override
    public String toString() {
        return "TriangleStorage{" +
                "triangles=" + triangles +
                '}';
    }
}
