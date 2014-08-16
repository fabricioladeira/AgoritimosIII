package mvc.view;

import static java.lang.System.out;
import java.util.ArrayList;
import mvc.model.Paciente;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PacienteIncluirView {

	public void printIncluir()
	{
	      JTextField campoNome = new JTextField(50);
	      JTextField campoTelefone = new JTextField(20);

	      JPanel myPanel = new JPanel();
	      myPanel.add(new JLabel("Nome:"));
	      myPanel.add(campoNome);
	      myPanel.add(Box.createVerticalStrut(15)); // a spacer
	      myPanel.add(new JLabel("Telefone:"));
	      myPanel.add(campoTelefone);
  
	        
	      int result = JOptionPane.showConfirmDialog(null, myPanel, 
	               "Inserir Paciente, por favor inclua os dados:", JOptionPane.OK_CANCEL_OPTION);
	           	      
	      
	      if (result == JOptionPane.OK_OPTION) {
	    	 
	    	 Paciente paciente = new Paciente();
	    	 paciente.setNome(campoNome.getText());
	    	 paciente.setTelefone(campoTelefone.getText());
	      }
	      
		
		
		
	}
	
	
}
