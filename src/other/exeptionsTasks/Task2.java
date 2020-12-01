package other.exeptionsTasks;

public class Task2 {
    //создать свое исключение, создать метод, который выбрасывает это исключение, и пробрасывает его.

    public static void main(String[] args) {

        try {
            doSmth();
        } catch (TestException e) {
            e.printStackTrace();
        }

    }


    public static void doSmth() throws TestException {
        throw new TestException();
    }

    static class TestException extends Exception{

        public TestException() {
        }
    }

}




