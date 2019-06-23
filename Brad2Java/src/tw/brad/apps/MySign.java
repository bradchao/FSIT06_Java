package tw.brad.apps;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import tw.brad.myjava.MyDrawer;

public class MySign extends JFrame {
	private JButton clear, undo, redo, saveJPG, saveObj, loadObj, changeColor;
	private MyDrawer myDrawer;
	
	public MySign() {
		super("簽名程式");
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		saveJPG = new JButton("Save JPG");
		saveObj = new JButton("Save Object");
		loadObj = new JButton("Load Object");
		changeColor = new JButton("Change Color");
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear); top.add(undo); top.add(redo);
		top.add(saveJPG); top.add(saveObj); top.add(loadObj);
		top.add(changeColor);
		
		add(top, BorderLayout.NORTH);
		
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					myDrawer.undo();
				}catch(Exception e2) {
					displayDialog("no more undo!");
				}
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
		
		saveJPG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveJPEG();
			}
		});
		
		changeColor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
			}
		});
		
		saveObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					myDrawer.saveObject(new File("dir1/brad.object"));
				}catch(Exception e2) {
					System.out.println(e2.toString());
				}
			}
		});
		
		loadObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					myDrawer.loadObject(new File("dir1/brad.object"));
				}catch(Exception e2) {
					System.out.println(e2.toString());
				}
			}
		});
		
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void changeColor() {
		Color newColor = JColorChooser.showDialog(this, "更換畫筆顏色", myDrawer.getColor());
		myDrawer.changeColor(newColor);
	}
	
	private void saveJPEG() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			try {
				myDrawer.saveJPEG(jfc.getSelectedFile());
				displayDialog("Save Success!");
			}catch(Exception e) {
				displayDialog("Save Failure!");
			}
		}
	}
	
	private void displayDialog(String mesg) {
		JOptionPane.showMessageDialog(this,	mesg);
	}
	
	
	public static void main(String[] args) {
		new MySign();
	}

}
