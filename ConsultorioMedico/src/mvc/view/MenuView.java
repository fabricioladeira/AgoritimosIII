package mvc.view;

import javax.swing.*; 

import mvc.controller.PacienteController;

import java.awt.*;
import java.awt.event.*;

public class MenuView {

	public void show()
	{
		//Faz com que tenha uma decoracao de janela
		 JFrame.setDefaultLookAndFeelDecorated(true);

		 //Cria e organiza a janela
		 JFrame frame = new JFrame("Consultório");
		 frame.setLayout(new FlowLayout());
		 frame.setSize(500, 300);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 //Cria botão Pacientes
		 JButton btnPacientes = new JButton();
		 btnPacientes.setVerticalTextPosition(AbstractButton.BOTTOM);
		 btnPacientes.setHorizontalTextPosition(AbstractButton.CENTER);
		 btnPacientes.setPreferredSize(new Dimension(200, 40));
		 btnPacientes.setMnemonic(KeyEvent.VK_M);
		 btnPacientes.setText("Pacientes");
		 btnPacientes.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
			    // ... called when button clicked
				  PacienteController pac = new PacienteController();
				  pac.show();
			  }
			});
		 
		 
		 frame.add(btnPacientes);
		 
		 //Cria botão Medicamentos
		 JButton btnMedicamentos = new JButton();
		 btnMedicamentos.setVerticalTextPosition(AbstractButton.BOTTOM);
		 btnMedicamentos.setHorizontalTextPosition(AbstractButton.CENTER);
		 btnMedicamentos.setPreferredSize(new Dimension(200, 40));
		 btnMedicamentos.setMnemonic(KeyEvent.VK_M);
		 btnMedicamentos.setText("Medicamentos");
		 
		 
		 frame.add(btnMedicamentos);
		 
		

		 /*
		 //Adiciona o rotulo "Alo Mundo".
		 JLabel label = new JLabel("Consultório");
		 frame.getContentPane().add(label);
		*/
		 
		 //Exibe a janela		 
		 frame.setVisible(true);		
	}
}
