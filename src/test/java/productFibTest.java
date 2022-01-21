import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class productFibTest {

    @Test
    public void return_Default_when_product_equals_2(){


        int[] result = new calculateProductFib().productFib(2);
        //F(n) * F(n+1) = product.

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,
        int[] Default = new int[]{2, 3, 0};

        assertEquals(result[0],Default[0]);
        assertEquals(result[1],Default[1]);
        assertEquals(result[2],Default[2]);
    }

}
