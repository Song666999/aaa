package P_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class java_caidan extends JFrame implements ActionListener{
	JMenuItem GB;
	
	public void CreateMenu(){
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		JMenu file = new JMenu("�ļ�");
		menuBar.add(file);
		GB = new JMenuItem("�ر�");
		file.add(GB);
		this.setTitle("�˵�");
		this.setSize(300,200);
		this.setLocation(400,400);
		this.setVisible(true);
		GB.addActionListener(this);
	
}
   public void actionPerformed(ActionEvent e){
	if(e.getSource() == GB){
		System.out.println("�����˳�");
		System.exit(0);
		}
}
	public static void main(String [] args){
	java_caidan f = new java_caidan();
	f.CreateMenu();
	

}


}