package com.simi.patterns.command;

public class CommandClient {

	public static void main(String[] args) {
		CommandExecutor commandExecutor = new CommandExecutor();
		commandExecutor.executeCommand(new ConcreteCommand());
		commandExecutor.executeCommand(new ConcreteCommand());
		commandExecutor.executeCommand(new ConcreteCommand());
		commandExecutor.undoExecute();
		commandExecutor.undoExecute();
	}
}
