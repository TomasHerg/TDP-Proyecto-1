package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	
            	Student est = new Student(126964, "Hergenreder", "Tomás", "tomahergenreder@gmail.com","https://github.com/TomasHerg/TDP-Proyecto-1", "/images/mi_foto");
            	SimplePresentationScreen pantalla = new SimplePresentationScreen(est);
            	pantalla.setVisible(true);
            }
        });
    }
}