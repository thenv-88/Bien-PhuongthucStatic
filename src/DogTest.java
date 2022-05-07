/*
    - Khai báo biến static(biến lớp) - numOfDogs,
    để đếm số đối tượng Dog được tạo ra.
*/

class Dog {
    private String name;

    // Khai báo biến lớp.
    public static int numOfDogs = 0;
    public Dog(String name) {
        this.name = name;
        numOfDogs++;
        System.out.println("# " + numOfDogs + " Dog " + name + " is created");
    }
}

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Micky");
        Dog d2 = new Dog("Jon");
        Dog d3 = new Dog("Henry");

        // Dùng tên lớp để truy nhập đến biến static.
        System.out.println("Tổng số đối tượng Dog được tạo ra là: " + Dog.numOfDogs);
    }
}
