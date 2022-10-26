package com.sda.patterns.behavioral.state.challenge;

public class Prepared implements PackageState {

	private static Prepared instance = new Prepared();

	private Prepared() {}

	@Override
	public void updateState(Context context) {
		System.out.println("package prepared");
		context.setCurrentState(InTransit.getInstance());
	}

	public static Prepared getInstance() {
		return instance;
	}
}
