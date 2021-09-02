package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.ComponentOrientation;
import java.awt.Component;
import javax.swing.DropMode;
import java.awt.Cursor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel labelLU;
	private JTextField textoLU;
	private JLabel labelFoto;
	private JTextField textoApellido;
	private JTextField textoNombre;
	private JTextField txtTomahergenredergmailcom;
	private JLabel labelGithub;
	private JTextField textoGithub;
	private JLabel labelFecha;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setIconImage(new ImageIcon(getClass().getResource("/images/tdp.png")).getImage());
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 284));
		setResizable(false);
		setContentPane(contentPane);
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 211);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		labelLU = new JLabel("LU");
		labelLU.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		labelLU.setVerticalAlignment(SwingConstants.TOP);
		labelLU.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		labelLU.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		textoLU = new JTextField();
		textoLU.setText("126964");
		textoLU.setDropMode(DropMode.INSERT);
		textoLU.setColumns(10);
		
		JLabel labelApellido = new JLabel("Apellido");
		
		textoApellido = new JTextField();
		textoApellido.setText("Hergenreder");
		textoApellido.setColumns(10);
		
		JLabel labelNombre = new JLabel("Nombre");
		
		textoNombre = new JTextField();
		textoNombre.setText("Tom\u00E1s");
		textoNombre.setColumns(10);
		
		JLabel labelMail = new JLabel("E-mail");
		
		txtTomahergenredergmailcom = new JTextField();
		txtTomahergenredergmailcom.setText("tomahergenreder@gmail.com");
		txtTomahergenredergmailcom.setColumns(10);
		
		labelGithub = new JLabel("Github");
		
		textoGithub = new JTextField();
		textoGithub.setText("https://github.com/TomasHerg/TDP-Proyecto-1");
		textoGithub.setColumns(10);
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(labelMail)
						.addComponent(labelGithub)
						.addComponent(labelLU, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelNombre)
						.addComponent(labelApellido))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(textoApellido, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
						.addComponent(txtTomahergenredergmailcom)
						.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textoLU)
							.addComponent(textoNombre)
							.addComponent(textoGithub, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)))
					.addGap(71))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
						.addComponent(textoLU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelLU))
					.addGap(9)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textoApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelApellido))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textoNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelNombre))
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(9)
							.addComponent(labelMail))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTomahergenredergmailcom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(labelGithub)
						.addComponent(textoGithub, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(34, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane);
		
		labelFoto = new JLabel("");
		labelFoto.setBounds(448, 26, 140, 190);
		labelFoto.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/mi_foto.jpg")));
		contentPane.add(labelFoto);
		Date fecha = new Date();
		labelFecha = new JLabel("La ventana fue generada el " + LocalDate.now() + " a las " + LocalTime.now());
		labelFecha.setBounds(5, 227, 312, 14);
		contentPane.add(labelFecha);
	}
}
