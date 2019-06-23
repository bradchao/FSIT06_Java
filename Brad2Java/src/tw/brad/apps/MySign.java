package tw.brad.apps;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.brad.myjava.MyDrawer;

public class MySign extends JFrame {
	private JButton clear, undo, redo, saveJPG, saveObj, loadObj;
	private MyDrawer myDrawer;
	
	public MySign() {
		super("簽名程式");
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		saveJPG = new JButton("Save JPG");
		saveObj = new JButton("Save Object");
		loadObj = new JButton("Load Object");
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear); top.add(undo); top.add(redo);
		top.add(saveJPG); top.add(saveObj); top.add(loadObj);
		
		add(top, BorderLayout.NORTH);
		
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MySign();
	}

}