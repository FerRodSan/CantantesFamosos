package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Modelo.CantanteFamoso;
import Modelo.ListaCantantesFamosos;
import Vista.Ui;

public class ParaUi extends Ui {

	ListaCantantesFamosos lista = new ListaCantantesFamosos();
	CantanteFamoso cantante;

	public ParaUi() {
		super();

		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(txtCantante.toString().isEmpty() && txtDisco.toString().isEmpty())) {
					cantante = new CantanteFamoso(txtCantante.getText(), txtDisco.getText());
					lista.anadirCantante(cantante);
					lblMostrarLista.setText(cantante.toString());
					txtCantante.setText("");
					txtDisco.setText("");
				} else {
					lblLista.setText("casilla vacia");
				}
			}
		});

		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muestraLista();
				lblLista.setText("Mostrando lista completa");
			}
		});

		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lista.getListaCantantes().clear();
				lblMostrarLista.setText("");
				lblLista.setText("Eliminacion de lista");
			}
		});
	}

	public void muestraLista() {
		lblMostrarLista.setText("");
		for (CantanteFamoso cantanteFamoso : lista.getListaCantantes()) {
			lblMostrarLista.setText(lblMostrarLista.getText() + cantanteFamoso.toString()+"\n");
		}
	}

}
