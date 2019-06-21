package com.naramay.www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class WorldTools extends Application {

	/*
	 * Elements needed for full functionality Main Window : Access to Tabs & Options
	 * Dice Roller Card Selection Hit Location Character Creator / Manager Calendar
	 */

	public void start(Stage stage) {
		String[] names = { "Main", "Dice/Cards", "Hit Location", "Calendar", "Character" };
		// Set Title
		stage.setTitle("Naramay World Tools");

		// Tab Pane
		TabPane tabpane = new TabPane();

		// Generate Tabs : Identities in string array
		for (String string : names) {
			setTabs(tabpane, string);
		}

		// Populate tabs with content through calls

		Scene scene = new Scene(tabpane, 800, 600);
		stage.setScene(scene);
		stage.show();

	}

	public void setTabs(TabPane tabpane, String name) {
		Tab tab = new Tab(name);
		tabpane.getTabs().add(tab);
	}

	public void setMainTab() {

	}

	public void setDiceTab() {

	}

	public void setCardTab() {

	}

	public void setHitTab() {

	}

	public void setCharTab() {

	}

	public static void main(String args[]) {
		launch(args);
	}

}
