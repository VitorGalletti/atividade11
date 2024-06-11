package Controlador;

import Modelo.InsertionSort;
import Modelo.modelo;
import Visao.visao;

public class controlador {
	
	private modelo modelo;
    private visao visao;

    public controlador(modelo modelo, visao visao) {
        this.modelo = modelo;
        this.visao = visao;
    }

    public void setNumero(int index, int valor) {
        modelo.setNumero(index, valor);
    }

    public void ordenarNumeros() {
        int[] numeros = modelo.getNumeros();
        InsertionSort.insertionSort(numeros);
        visao.exibirNumeros(numeros);
    }
}
