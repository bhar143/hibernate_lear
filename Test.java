package service;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory	;

public class Test {

	public static void main(String[] args) {
		System.out.println("Connecting to database");
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		System.out.println("created");

	}

}
