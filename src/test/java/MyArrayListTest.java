import junit.framework.TestCase;
import org.example.MyArrayList;

public class MyArrayListTest extends TestCase {

    MyArrayList<Integer> myArrayList;
    MyArrayList<String> myArrayList2;

    @Override
    protected void setUp() {

        myArrayList = new MyArrayList<>();
        myArrayList.add(33);
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(30);
        myArrayList.add(31);

        myArrayList2 = new MyArrayList<>();
        myArrayList2.add("Грушин");
        myArrayList2.add("Бананов");
        myArrayList2.add("Абрикосов");
        myArrayList2.add("Вишневский");
        myArrayList2.add("Дынин");
    }

    public void testGet() {

        assertEquals(Integer.valueOf(33), myArrayList.get(0));
        assertEquals("Вишневский", myArrayList2.get(3));
    }

    public void testAdd() {

        myArrayList.add(777);
        assertEquals(Integer.valueOf(777), myArrayList.get(5));
        myArrayList2.add("Огурцов");
        assertEquals("Огурцов", myArrayList2.get(5));
    }

    public void testRemove() {

        myArrayList.remove(0);
        assertEquals(Integer.valueOf(34), myArrayList.get(0));
        assertEquals(4, myArrayList.length);
        myArrayList2.remove(3);
        assertEquals("Дынин", myArrayList2.get(3));
    }

    public void testInsert() {

        myArrayList.insert(777, 0);
        assertEquals(Integer.valueOf(33), myArrayList.get(1));
        myArrayList2.insert("Огурцов", 3);
        assertEquals("Огурцов", myArrayList2.get(3));
        assertEquals(6, myArrayList2.length);
    }

    public void testClear() {

        myArrayList.clear();
        assertEquals(0, myArrayList.length);
        myArrayList2.clear();
        assertEquals(0, myArrayList2.length);
    }

    public void testQuickSort() {

        myArrayList.quickSort(myArrayList, 0, myArrayList.length - 1);
        assertEquals(Integer.valueOf(30), myArrayList.get(0));
        assertEquals(Integer.valueOf(31), myArrayList.get(1));
        assertEquals(Integer.valueOf(32), myArrayList.get(2));
        assertEquals(Integer.valueOf(33), myArrayList.get(3));
        assertEquals(Integer.valueOf(34), myArrayList.get(4));

        myArrayList2.quickSort(myArrayList2, 0, myArrayList2.length - 1);
        assertEquals("Абрикосов", myArrayList2.get(0));
        assertEquals("Бананов", myArrayList2.get(1));
        assertEquals("Вишневский", myArrayList2.get(2));
        assertEquals("Грушин", myArrayList2.get(3));
        assertEquals("Дынин", myArrayList2.get(4));
    }
}
