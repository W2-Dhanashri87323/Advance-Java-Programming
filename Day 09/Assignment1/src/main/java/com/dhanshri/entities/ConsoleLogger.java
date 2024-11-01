package com.dhanshri.entities;

import org.springframework.stereotype.Component;

import com.dhanshri.interfaces.Loggerable;

@Component
public class ConsoleLogger implements Loggerable {

	@Override
	public void print(String msg) {
		System.out.println("Console Logger ::" + msg);
	}

}