import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class productFibTest {

    @Test
    public void return_Default_when_product_equals_3(){

        int[] result = new calculateProductFib().productFib(3);
        int[] Default = new int[]{1, 2, 0};

        assertEquals(result[0],Default[0]);
        assertEquals(result[1],Default[1]);
        assertEquals(result[2],Default[2]);
    }

    @Test
    public void return_Array_when_product_equals_0(){

        int[] result = new calculateProductFib().productFib(0);
        int[] Default = new int[]{0, 1, 1};

        assertEquals(result[0],Default[0]);
        assertEquals(result[1],Default[1]);
        assertEquals(result[2],Default[2]);
    }

    @Test
    public void return_Array_when_product_equals_714(){

        int[] result = new calculateProductFib().productFib(714);
        int[] Default = new int[]{21, 34, 1};

        assertEquals(result[0],Default[0]);
        assertEquals(result[1],Default[1]);
        assertEquals(result[2],Default[2]);
    }

}
