import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class myArrayIndexRowAndColumnAlpharTest {

	@Test
	public static void testRowArray() {

	int[] myList = {1, 5, 3, 4, 5, 5};

	int[] expected = {1};


	int[] returned = ArrayIndexRowAndColumnAlphar.addArrayIn(myList);
	
	assertArrayEquals(expected, returned);

	
}

}