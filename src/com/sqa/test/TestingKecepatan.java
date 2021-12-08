package com.sqa.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sqa.main.kecepatan.KecepatanRataRata;

public class TestingKecepatan {

	KecepatanRataRata kecepatan;
	
	@Before
	public void setUp() throws Exception {
		kecepatan = new KecepatanRataRata();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testHitungKecepatan() {
		
		assertEquals(40.0, kecepatan.HitungKecepatan(200.0f, 5.0f),0.0);
		
	}

}
