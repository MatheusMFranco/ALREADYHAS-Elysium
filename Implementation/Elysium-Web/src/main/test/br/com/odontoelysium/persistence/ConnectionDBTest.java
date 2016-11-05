package br.com.odontoelysium.persistence;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.alreadyhas.elysium.persistence.ConnectionDB;

public class ConnectionDBTest {

	public static void main(String[] args) {
		ConnectionDB.getConnection();
	}

	@Test
	public void connectSuccess() {
		assertNotNull("[CONNECTION: YES]", ConnectionDB.getConnection());
	}

}
