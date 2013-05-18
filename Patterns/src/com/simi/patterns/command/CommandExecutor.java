package com.simi.patterns.command;

import java.util.Stack;

public class CommandExecutor {
	Stack<ICommand> commandStack;
	
	public CommandExecutor() {
		commandStack = new Stack<>();
	}
	
	void executeCommand(ICommand command) {
		commandStack.push(command);
		command.doIt();
	}
	
	void undoExecute() {
		commandStack.pop().unDo();
	}
	
}
