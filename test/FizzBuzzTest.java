import org.junit.Test;
import static  org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private String expected;
    @Test
    public void given_1_should_return_1(){
        assertEquals(expected = "1", new FizzBuzz().get(1));
    }
    @Test
    public void given_2_should_return_2(){
        assertEquals(expected = "2", new FizzBuzz().get(2));
    }
    @Test
    public void given_3_should_return_Fizz(){
        assertEquals(expected = "Fizz", new FizzBuzz().get(3));
    }
    @Test
    public void given_6_should_return_Fizz(){
        assertEquals(expected = "Fizz", new FizzBuzz().get(6));
    }
    @Test
    public void given_5_should_return_Buzz(){
        assertEquals(expected = "Buzz", new FizzBuzz().get(5));
    }
    @Test
    public void given_10_should_return_Buzz(){
        assertEquals(expected = "Buzz", new FizzBuzz().get(10));
    }

    @Test
    public void given_15_should_return_FizzBuzz(){
        assertEquals(expected = "FizzBuzz", new FizzBuzz().get(15));
    }
    @Test
    public void given_30_should_return_FizzBuzz(){
        assertEquals(expected = "FizzBuzz", new FizzBuzz().get(30));
    }

}
