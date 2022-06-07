package EJERCICIO2y3;
	import java.awt.BorderLayout;
	import java.awt.FlowLayout;
	import java.awt.GridLayout;

	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JList;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;

import org.jdesktop.swingx.JXDatePicker;


	public class PictureViewer extends JFrame 
	{
		public PictureViewer()
		{
			this.setTitle("Photography");
			this.setSize(700,500);
			this.setLayout(new GridLayout (2,2,0,0));
			
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel panel4 = new JPanel();
			
			//PANEL 1 (ARRIBA-IZQUIERDA)
			anadirelementosPanel1(panel1);
			this.add(panel1);
			
			//PANEL 2 (ARRIBA-DERECHA)
			anadirelementosPanel2(panel2);
			this.add(panel2);
			//PANEL 3 (ABAJO-IZQUIERDA)
			anadirelementosPanel3(panel3);
			this.add(panel3);
			//PANEL 4 (ABAJO-DERECHA)
			anadirelementosPanel4(panel4);
			this.add(panel4);
			
			
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		private void anadirelementosPanel4(JPanel panel4) {
			JLabel label_imagen = new JLabel();
			panel4.add(label_imagen);
		}
		private void anadirelementosPanel3(JPanel panel3) {
			JList lista = new JList();
			JScrollPane sp = new JScrollPane (lista);
			sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			panel3.add(sp);
			
		}
		private void anadirelementosPanel2(JPanel panel2) {
			panel2.setLayout(new BorderLayout());
			JPanel panel_norte = new JPanel();
			panel_norte.setLayout(new FlowLayout());
			JLabel label_fecha = new JLabel("Fotos antes de: ");
			JXDatePicker fecha = new JXDatePicker();
			panel_norte.add(label_fecha);
			panel_norte.add(fecha);
			panel2.add(panel_norte,BorderLayout.NORTH);
		}
		private void anadirelementosPanel1(JPanel panel1) {
			panel1.setLayout(new BorderLayout());
			JPanel panel_norte = new JPanel();
			panel_norte.setLayout(new FlowLayout());
			JLabel label_fotografo = new JLabel("Fotografo:");
			JComboBox combo = new JComboBox();
			panel_norte.add(label_fotografo);
			panel_norte.add(combo);
			panel1.add(panel_norte,BorderLayout.NORTH);

			
		}
		public static void main (String [] args)
		{
			PictureViewer V1 = new PictureViewer();
		}
}
