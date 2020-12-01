package other.exeptionsTasks;

public class Task1 {
    //создать код который выводит ArrayIndexOOBException


    public static void main(String[] args) {

        int[] ints = new int[5];

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(ints[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Фышли за границы массива!");
        }


    }

}
