// import static org.junit.Assert.assertEquals;
// import org.junit.*;

/**
 * Main class, para ejecutar el programa
 */
public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame(new RadioG8());
    }

    // @Test
    // public void test1() {
    //     RadioG8 radio1 = new RadioG8();
    //     radio1.nextStation(true);
    //     assertEquals(540.0, radio1.getStation(), 0.1);
    // }

    // @Test
    // public void test2() {
    //     RadioG8 radio2 = new RadioG8();
    //     radio2.switchAMFM();
    //     radio2.nextStation(false);
    //     radio2.nextStation(false);
    //     radio2.prevStation(false);
    //     assertEquals(88.1, radio2.getStation(), 0.01);
    // }

    // @Test
    // public void test3() {
    //     RadioG8 radio3 = new RadioG8();
    //     radio3.switchAMFM();
    //     radio3.nextStation(radio3.getFrequency());
    //     radio3.saveStation(1, 88.1);
    //     assertEquals(88.1, radio3.getSavedStation(1), 0.01);
    //     assertEquals(false, radio3.getFrequency());
    // }

}
