package com.simi.patterns.state;

class StateClient {

	public static void main(String[] args)  {
		File file = new File();
		file.openFile();
		file.closeFile();
		file.delteFile();
		file.openFile();
		file.delteFile();
	}
 }

class File {
	FileState currentState;
	FileOpen openState;
	FileClosed closedState;
	FileDeleted deletedState;

	public File() {
		openState = new FileOpen(this);
		closedState = new FileClosed(this);
		deletedState = new FileDeleted(this);
		currentState = closedState;
	}
	
	void openFile() {
		currentState.open();
	}
	
	void closeFile() {
		currentState.close();
	}
	
	void delteFile() {
		currentState.delete();
	}
	
	public FileClosed getClosedState() {
		return closedState;
	}
	public FileState getCurrentState() {
		return currentState;
	}
	public FileDeleted getDeletedState() {
		return deletedState;
	}
	
	public FileOpen getOpenState() {
		return openState;
	}
	
	public void setCurrentState(FileState currentState) {
		this.currentState = currentState;
	}
}

abstract class FileState {
	
	protected File file;
	
	FileState(File file) {
		this.file = file;
	}
	
	abstract void open();
	abstract void close();
	abstract void delete();
}

class FileOpen extends FileState {
	
	public FileOpen(File file) {
		super(file);
	}
	
	@Override
	public void open() {
		// Nothing happens is already open
	}

	@Override
	public void close() {
		System.out.println("Closed file");
		file.setCurrentState(file.getClosedState());
	}

	@Override
	public void delete() {
		System.out.println("File deleted");
		file.setCurrentState(file.getDeletedState());
	}
}

class FileClosed extends FileState {

	FileClosed(File file) {
		super(file);
	}

	@Override
	void open() {
		System.out.println("Open File");
		file.setCurrentState(file.getOpenState());
	}

	@Override
	void close() {
		// Do nothing file is already closed
	}

	@Override
	void delete() {
		System.out.println("First open the file before you can delete it");
	}
}

class FileDeleted extends FileState {

	FileDeleted(File file) {
		super(file);
	}

	@Override
	void open() {
		System.out.println("File is deleted cant be opened");
	}

	@Override
	void close() {
		System.out.println("File is deleted cant be closed");
	}

	@Override
	void delete() {
		// Do nothing file is already deleted
	}
	
}