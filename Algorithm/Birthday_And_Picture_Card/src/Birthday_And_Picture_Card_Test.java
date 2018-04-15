import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Birthday_And_Picture_Card_Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	
	@Test
	public void testBirthdayAndPictureCard1() 
	{
	    int M = 20;
	    double rst[] = new double[2];
	    rst[0] = Math.sqrt(0.5 * 3.1415 * M);
	    rst[1] = M * Math.log(M);
	    assert(rst[0]*0.92 < Hash_Table.getTestResults(1000, M)[0] && rst[0]*1.08 > Hash_Table.getTestResults(40, M)[0]);
	    assert(rst[1] - 20 < Hash_Table.getTestResults(1000, M)[1] && rst[1] + 20 > Hash_Table.getTestResults(1000, M)[1]);
	}
	
	@Test
	public void testBirthdayAndPictureCard2() 
	{
	    int M = 40;
	    double rst[] = new double[2];
	    rst[0] = Math.sqrt(0.5 * 3.1415 * M);
	    rst[1] = M * Math.log(M);
	    assert(rst[0]*0.92 < Hash_Table.getTestResults(1000, M)[0] && rst[0]*1.08 > Hash_Table.getTestResults(40, M)[0]);
	    assert(rst[1] * 0.8 < Hash_Table.getTestResults(1000, M)[1] && rst[1]*1.2 > Hash_Table.getTestResults(1000, M)[1]);
	}
	
	@Test
	public void testBirthdayAndPictureCard3() 
	{
	    int M = 80;
	    double rst[] = new double[2];
	    rst[0] = Math.sqrt(0.5 * 3.1415 * M);
	    rst[1] = M * Math.log(M);
	    assert(rst[0]*0.92 < Hash_Table.getTestResults(1000, M)[0] && rst[0]*1.08 > Hash_Table.getTestResults(40, M)[0]);
	    assert(rst[1] * 0.8 < Hash_Table.getTestResults(1000, M)[1] && rst[1]*1.2 > Hash_Table.getTestResults(1000, M)[1]);
	}
	
	@Test
	public void testBirthdayAndPictureCard4() 
	{
	    int M = 400;
	    double rst[] = new double[2];
	    rst[0] = Math.sqrt(0.5 * 3.1415 * M);
	    rst[1] = M * Math.log(M);
	    assert(rst[0]*0.92 < Hash_Table.getTestResults(1000, M)[0] && rst[0]*1.08 > Hash_Table.getTestResults(40, M)[0]);
	    assert(rst[1] * 0.8 < Hash_Table.getTestResults(1000, M)[1] && rst[1]*1.2 > Hash_Table.getTestResults(1000, M)[1]);
	}
	
	@Test
	public void testBirthdayAndPictureCard5() 
	{
	    int M = 1000;
	    double rst[] = new double[2];
	    rst[0] = Math.sqrt(0.5 * 3.1415 * M);
	    rst[1] = M * Math.log(M);
	    assert(rst[0]*0.92 < Hash_Table.getTestResults(1000, M)[0] && rst[0]*1.08 > Hash_Table.getTestResults(40, M)[0]);
	    assert(rst[1] * 0.8 < Hash_Table.getTestResults(1000, M)[1] && rst[1]*1.2 > Hash_Table.getTestResults(1000, M)[1]);
	}

	void test() {
		fail("Not yet implemented");
	}

}
