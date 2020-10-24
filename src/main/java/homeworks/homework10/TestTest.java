package homeworks.homework10;

import java.lang.reflect.Array;
import java.util.*;

public class TestTest {

    private String name;
    private int id;

    public TestTest(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestTest testTest = (TestTest) o;
        return id == testTest.id &&
                Objects.equals(name, testTest.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode method invoked");
        return id;
    }
}
