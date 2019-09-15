package clase9;

public class PrueboFecha {
	
	public static void main(String[] s){
		
		System.out.println("Pruebo diasDelMes con la fecha: ");
		Fecha f1=new Fecha(1,2,2019);
		f1.imprimir();
		
		System.out.print("La cantidad de dias que tiene el mes de la fecha introducida es:  "+Fecha.diasDelMes(f1.mes,f1.anio));
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Pruebo esValida con la fecha: ");
		Fecha f2=new Fecha(29,2,2016);
		f2.imprimir();
		
		System.out.print("Con la fecha introducida esValida es una afirmacion:  "+f2.esValida());
		
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Pruebo  antesQue con la fecha: ");
		Fecha f3=new Fecha(2,2,2016);
		f2.imprimir();
		System.out.println("Con la fecha: ");
		Fecha f4=new Fecha(4,2,2016);
		f4.imprimir();
		
		System.out.print("La primer fecha es anterior a la segunda es una afirmacion es una afirmacion:  "+f3.antesQue((f4)));
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Pruebo diaDelAnio con la fecha: ");
		Fecha f5=new Fecha(31,12,2020);
		f5.imprimir();
		
		System.out.print("La fecha introducida es el dia del anio numero:  "+f5.diaDelAnio());
		
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Pruebo diasDeDiferenciaCon con la fecha: ");
		Fecha f6=new Fecha(31,12,2020);
		f5.imprimir();
		System.out.println("y la fecha: ");
		Fecha f7=new Fecha(4,2,2021);
		f4.imprimir();
		
		System.out.print("La diferencia de dias entre estas dos fechas es:  "+f6.diasDeDiferenciaCon(f7));
		
		System.out.println("");
		System.out.println("");
		
		
	}

}
