module battleships{
	requires transitive javafx.base;
	requires transitive javafx.controls;
	requires javafx.graphics;
	requires transitive javafx.fxml;
	//requires javax.jms.api;
	//requires imqjmsra;


	opens battleships.controller to javafx.fxml;

	
	exports battleships;
	exports battleships.model;
	exports battleships.controller;

}