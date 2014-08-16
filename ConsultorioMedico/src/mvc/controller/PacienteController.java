package mvc.controller;

import java.util.ArrayList;

import mvc.model.Paciente;
import mvc.view.PacienteIncluirView;
import mvc.view.PacienteListaView;

public class PacienteController {

	public ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();	
	
	public void formularioPacienteIncluirShow()
	{
		PacienteIncluirView view = new PacienteIncluirView();
		view.printIncluir();		
	}
	
	public void incluir(Paciente paciente)
	{
		listaPaciente.add(paciente);		
	}
	
	public void show()
	{
		PacienteListaView lista = new PacienteListaView();
		lista.show(listaPaciente);	
	}
	
}
