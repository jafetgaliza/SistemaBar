package br.sistemaBar;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeMesas {
	
	private List<Mesa> mesas;
	
	public GerenciadorDeMesas(){
		this.mesas = new ArrayList<Mesa>();
	}
	
	public void cadastrarMesa(Mesa m){
		this.mesas.add(m);
	}
	
	public void removerMesa(int numMesa){
		this.mesas.remove(numMesa);
	}
	
	public Mesa pesquisarMesa(int numMesa){
		
		List<Mesa> mesasTemp = new ArrayList<Mesa>();
		
		for(Mesa m : this.mesas){
			if(m.getNumMesa() == numMesa){
				mesasTemp.add(m);
			}
		}return mesasTemp.get(0);
	}

}
