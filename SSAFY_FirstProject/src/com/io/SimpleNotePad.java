package com.io;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class SimpleNotePad extends JPanel implements ActionListener {
    static private final String newline = "\n";
    JButton openButton, saveButton;
    JTextArea log;
    JFileChooser fc; //***

    public SimpleNotePad() { //ȭ�鱸��
        super(new BorderLayout());
        log = new JTextArea(5,20);
       
        JScrollPane logScrollPane = new JScrollPane(log);
        fc = new JFileChooser(); //***

        openButton = new JButton("Open a File...");
        openButton.addActionListener(this);

        saveButton = new JButton("Save a File...");
        saveButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(); //use FlowLayout
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
    
        add(buttonPanel, BorderLayout.PAGE_START);
        add(logScrollPane, BorderLayout.CENTER);
    }

    //��ư Ŭ�� �� �̺�Ʈ ó�� �޼ҵ�
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == openButton) {
        	//showOpenDialog(): ȭ�鿡 ���� â�� ��� ��
            int returnVal = fc.showOpenDialog(this);

            if (returnVal == JFileChooser.APPROVE_OPTION) { //�����ư Ŭ����
                File file = fc.getSelectedFile();//�������� �˾Ƴ���
                //���Ϸκ��� �о���� �۾�
                log.setText("");
                
                try{
                	FileReader fr = new FileReader(file);
            		BufferedReader br = new BufferedReader(fr);
            		
            		for (String str; (str = br.readLine()) != null;) {
            			log.append(str + "\n");
            		}
            		
            		br.close();
            		fr.close();
				  
                }catch(Exception ex){}              
                
            }             

        //Handle save button action.
        } else if (e.getSource() == saveButton) {
        	//showSaveDialog(): ȭ�鿡 ���� â�� ��� ��
            int returnVal = fc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try{
					//here...
                	FileWriter fw = new FileWriter(file);
            		BufferedWriter bw = new BufferedWriter(fw);
            		
            		bw.write(log.getText());
            		bw.newLine();
            		
            		bw.close();
            		fw.close();
                
                }catch(Exception x){}       
            } 
        }
    }

    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("FileChooserTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new SimpleNotePad();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
         createAndShowGUI();
    }
}
