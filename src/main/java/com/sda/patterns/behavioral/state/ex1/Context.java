package com.sda.patterns.behavioral.state.ex1;

public class Context {

	private State currentState;

	public Context() {
		currentState = null;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public State getCurrentState() {
		return currentState;
	}
}
