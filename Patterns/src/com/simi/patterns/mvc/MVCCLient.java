package com.simi.patterns.mvc;

import java.util.ArrayList;
import java.util.List;

class MVCCLient {

	public static void main(String[] args) {
		IModel model = new Model();
		Controller controller = new Controller(model);
		controller.getView().usernameChanged("simi");
		controller.getView().pressSaveButtion();
	}
}


class View implements IView  {
	
	private IController controller;
	private IModel model;

	public View(IController controller, IModel model) {
		this.controller = controller;
		this.model = model;
		this.model.registerObserver(this);
	}
	
	@Override
	public void onChangeModel() {
		System.out.println("Username changed to: "  + model.getUsername());
	}

	@Override
	public void pressSaveButtion() {
		controller.save();
	}

	@Override
	public void usernameChanged(String name) {
		controller.changeUserName(name);
	}
	
}

interface IView {
	void onChangeModel();
	void pressSaveButtion();
	void usernameChanged(String name);
}


interface IController {
	void save();
	void changeUserName(String name);
}

class Controller implements IController {

	private IModel model;
	private IView view;

	public Controller(IModel model) {
		this.model = model;
		view = new View(this, model);
	}
	
	public IView getView() {
		return view;
	};

	@Override
	public void save() {
		System.out.println("Saved model");
	}

	@Override
	public void changeUserName(String name) {
		model.setUsername(name);
	}
	
}

interface IModel {
	
	void registerObserver(IView view);
	String getUsername();
	void setUsername(String name);
	void notifyObserver();
	void removeObserver(IView view);
}

class Model implements IModel {
	List<IView> observers;
	private String name;
	
	Model() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(IView view) {
		observers.add(view);
	}

	@Override
	public void notifyObserver() {
		for (IView view : observers) {
			view.onChangeModel();
		}
	}

	@Override
	public void removeObserver(IView view) {
		observers.remove(view);
	}

	@Override
	public void setUsername(String name) {
		this.name = name;
		notifyObserver();
	}

	@Override
	public String getUsername() {
		return name;
	}
	
}