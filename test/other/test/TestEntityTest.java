package other.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestEntityTest {



    @Test
    public void getName() {

        TestEntity testEntity = new TestEntity("testEntity");

        assertEquals("testEntity", testEntity.getName());

    }
}