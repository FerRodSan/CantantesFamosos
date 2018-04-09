package Modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Control.ParaUi;

public class ListaCantantesFamosos {

	private ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();

	public ArrayList<CantanteFamoso> getListaCantantes() {
		return listaCantantes;
	}

	public void setListaCantantes(ArrayList<CantanteFamoso> listaCantantes) {
		this.listaCantantes = listaCantantes;
	}

	public void anadirCantante(CantanteFamoso cantanteNuevo) {
			listaCantantes.add(cantanteNuevo);
	}

}
