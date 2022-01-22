
import org.junit.*;

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame(new RadioG8());
    }

    @Test
    public void test1() {
        RadioG8 radio1 = new RadioG8();
        radio1.nextStation(true);
        assertEquals(540, radio1.getStation());

    }
}
