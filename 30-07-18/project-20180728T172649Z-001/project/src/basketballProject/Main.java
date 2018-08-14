package basketballProject;

import basketballProject.User;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main{
	
	private static User current;
	
	public static void main(String[] args) {
		DBC database = new DBC();
		User user = new User("Salad", "Bowl");
		user.setName("Jave", "Object");
		database.addUser(user);
		database.getAllUsers();
		System.out.println(database.getUser("Salad").getfName());
//		Video vid = new Video("Shooting", "https://www.youtube.com/");
//		Play play = new Play("Catch & Shoot");
//		Rule rule = new Rule("Shooting Rules");
//		Lesson lesson = new Lesson("Shooting 101", rule.getID(),play.getID(), vid.getID());
//		System.out.println(user.toJson());
//		System.out.println(vid.toJson());
//		System.out.println(lesson.toJson());
	}
}
