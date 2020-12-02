package other.myApps.convertTxtToCsv;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    Converter converter = new Converter();

    @Test
    public void sum() {

double a = 3;
double b = 0;

double expected = 0;
double actual = converter.sum(a, b);

        Assert.assertEquals(expected, actual, 0.01);
    }
}