package com.simi.patterns.command;

interface ICommand {
	void doIt();
	void unDo();
}

public class ConcreteCommand implements ICommand{

	@Override
	public void doIt() {
		System.out.println("Do it");
	}

	@Override
	public void unDo() {
		System.out.println("Undo It");
	}

}
