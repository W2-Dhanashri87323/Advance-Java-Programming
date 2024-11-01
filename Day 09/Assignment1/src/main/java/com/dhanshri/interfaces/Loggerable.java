package com.dhanshri.interfaces;

public interface Loggerable {
	void print(String msg);

	default void log(String message) {}
}
