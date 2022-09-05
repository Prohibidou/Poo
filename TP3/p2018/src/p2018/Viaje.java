package p2018;

import java.util.ArrayList;

public abstract class Viaje {
private Double valor;
private Double descuento;

abstract public Double calcPrecio();





public Double getValor() {
	return valor;
}

public void setValor(Double valor) {
	this.valor = valor;
}

public Double getDescuento() {
	return descuento;
}

//cantidad de viajes que tiene dentro del mes la persona, de manera que si en el mes va realizando
//30 viajes, al momento de calcular su precio entonces

public void setDescuento(ArrayList<Viaje> viajes) {
	int cant = viajes.size();
	if (cant<=10 && cant>0) {
		this.descuento=0.0;
	}else if (cant<=20 && cant>11) {
		this.descuento=0.75;
	}else if(cant<=30 && cant>21) {
		this.descuento=0.50;
	}else {
		this.descuento= 0.35;
	}
}



	
	
}
