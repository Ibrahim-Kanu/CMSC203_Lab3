import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private String ts;
	private String tst;
	private GradeBook t1;
	private GradeBook t2;

	@BeforeEach
	void setUp() throws Exception {
		ts = "[99.5, 88.3, 64.88, 31.459]";
		tst = "[33.5, 0.5, 73.0, 86.7, 59.8]";
		
		t1 = new GradeBook(5);
		t2 = new GradeBook(5);
		
		t1.addScore(99.5);
		t1.addScore(88.3);
		t1.addScore(64.88);
		t1.addScore(31.459);
		
		t2.addScore(33.5);
		t2.addScore(.5);
		t2.addScore(73);
		t2.addScore(86.7);
		t2.addScore(59.8);
	}

	@AfterEach
	void tearDown() throws Exception {
		t1 = null;
		t2 = null;
	}

	@Test
	void testGradeBook() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddScore() {
		assertTrue(t1.toString() == ts);
		assertEquals(true, t1.getScoresSize() == 4);
		assertTrue(t2.toString() == tst);
		assertEquals(true, t2.getScoresSize() == 5);
	}

	@Test
	void testGetScoresSize() {
		fail("Not yet implemented");
	}

	@Test
	void testSum() {
		assertEquals(true, t2.sum() == 253.5);
		assertEquals(true, t1.sum() == 284.139);
	}

	@Test
	public void testMinimum() {
		double m1 = 31.459;
		double m2 = .5;
		
		assertEquals(true, t1.minimum() == m1);
		assertEquals(true, t2.minimum() == m2);
	}

	@Test
	public void testFinalScore() {
		double f2 = 253;
		double f1 = 252.68;
		assertEquals(true, t2.finalScore() == f2);
		assertEquals(true, t1.finalScore() == f1);
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
