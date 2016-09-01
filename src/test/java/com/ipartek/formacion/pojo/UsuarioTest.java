package com.ipartek.formacion.pojo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UsuarioTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void constructorPorDefecto() {
		Usuario user1 = new Usuario();
		assertEquals(-1, user1.getId());
		assertEquals("", user1.getNombre());
		assertEquals("", user1.getPassword());
		assertEquals("", user1.getEmail());
	}

}
