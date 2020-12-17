package newTask.com.epam.jwd.model;


import java.util.Objects;

public class NewTriangle implements Figure {

    private NewLine a;
    private NewLine b;
    private NewLine c;


    public NewTriangle(NewLine a, NewLine b, NewLine c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public NewLine getA() {
        return a;
    }

    public NewLine getB() {
        return b;
    }

    public NewLine getC() {
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewTriangle that = (NewTriangle) o;
        return Objects.equals(a, that.a) &&
                Objects.equals(b, that.b) &&
                Objects.equals(c, that.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "NewTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private NewLine a;
        private NewLine b;
        private NewLine c;


        public Builder a(NewLine a) {
            this.a = a;
            return this;
        }

        public Builder b(NewLine b) {
            this.b = b;
            return this;
        }

        public Builder c(NewLine c) {
            this.c = c;
            return this;
        }

        public NewTriangle build() {

            return new NewTriangle(this.a, this.b, this.c);

        }
    }
}
