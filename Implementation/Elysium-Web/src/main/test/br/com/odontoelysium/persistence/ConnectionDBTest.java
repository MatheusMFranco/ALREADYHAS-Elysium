package br.com.odontoelysium.persistence;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConnectionDBTest {

	public static void main(String[] args) {
		ConnectionDB.getConnection();
	}

	@Test
	public void connectSuccess() {
		assertNotNull("[CONNECTION: YES]", ConnectionDB.getConnection());
	}

}
