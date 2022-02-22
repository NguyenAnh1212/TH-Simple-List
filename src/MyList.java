import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;// lưu số phần tử tối đa trong ds = 10.
    private Object elements[];
    // Phương thức khởi tạo không tham số, tạo mảng đối tượng element chứa các phần trong ds.
    public MyList() {
       elements = new Object[DEFAULT_CAPACITY];
    }
    // Phương thức tăng gấp đôi kích thước mảng.
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    //Thêm một phần tử vào cuối danh sách, tham số đầu vào là phần tử cần thêm vào ds.
    // nếu mảng có size bằng độ dài mảng thì gấp đôi kích thước mảng sau đó gán phần tử thứ length +1 bằng e.
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
// Phương thức get() trả về phần tử thứ i trong ds, tham số là vị trí cần truy cập.
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }


}
