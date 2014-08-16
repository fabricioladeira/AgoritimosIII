package mvc.view;

import javax.swing.*; 

import mvc.model.Paciente;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PacienteListaView {
	
	public void show(ArrayList<Paciente> value)
	{	 
		//Faz com que tenha uma decoracao de janela
		 JFrame.setDefaultLookAndFeelDecorated(true);

		 //Cria e organiza a janela
		 JFrame frame = new JFrame("Consultório");
		 frame.setLayout(new FlowLayout());
		 frame.setSize(500, 300);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
		 //Cria botão Pacientes
		 JButton btnIncluir = new JButton();
		 btnIncluir.setVerticalTextPosition(AbstractButton.BOTTOM);
		 btnIncluir.setHorizontalTextPosition(AbstractButton.CENTER);
		 btnIncluir.setPreferredSize(new Dimension(200, 40));
		 btnIncluir.setMnemonic(KeyEvent.VK_M);
		 btnIncluir.setText("Incluir");
		 
		 frame.add(btnIncluir);
		
		 Object rowData[][] = { 
								 { "Row1-Column1", "Row1-Column2"},
								 { "Row2-Column1", "Row2-Column2" } 
				 };
		 
		 //Object array = value.toArray(new Paciente[value.size()]);
		 
		 Object columnNames[] = { "Nome", "Telefone"};
		 JTable table = new JTable(rowData, columnNames);
		
		 frame.add(table);
		 
		/*
		for (Paciente paciente : value) {
			out.println(paciente.getNome() + "  Telefone: " + paciente.getTelefone());
		}
		*/
		 
		 //Exibe a janela		 
		 frame.setVisible(true);	
	}
}
