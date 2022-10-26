package com.sda.patterns.behavioral.state.challenge;

public class Delivered implements PackageState {

	private static Delivered instance = new Delivered();

	private Delivered() {}

	@Override
	public void updateState(Context context) {
		System.out.println("delivery complete");
	}

	public static Delivered getInstance() {
		return instance;
	}
}
