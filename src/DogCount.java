/*
    - Khai báo biến lớp
    - Khai báo phương thức lớp
*/
class Dogs {
    private String name;
    private static int numOfDogs = 0;

    public Dogs(String name) {
        this.name = name;
        numOfDogs++;
    }

    public static int getCout() {
        return numOfDogs;
    }

    public String getName() {
        return name;
    }
}
public class DogCount {
    public static void main(String[] args) {

       /*
            - Dùng tên lớp để gọi phương thức static
            - Truy cập được số lượng Dog ngay cả khi chưa có đối tượng
              Dog nào được tạo ra.
        */
        System.out.println(Dogs.getCout());

        Dogs d1 = new Dogs("Micky");
        System.out.println(Dogs.getCout());

        Dogs d2 = new Dogs("Jon");
        System.out.println(Dogs.getCout());

        Dogs d3 = new Dogs("Henry");
        System.out.println(d3.getCout()); // Gọi phương thức từ tham chiếu đối tượng.
    }
}
