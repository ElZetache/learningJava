package awesomeSauce;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class PruebaCalendario {
	public static void main(String[] args) throws ParseException {
		String mes = "Octubre";	
		String anyo = "2022";
		int semana = 0;
		String diaInicioMes = "";
		
		
		
		System.out.println(mes + "/" + anyo);
		System.out.println("------------");
		System.out.println(" L  M  M  J  V  S  D");
		System.out.println(" -  -  -  -  -  -  -");
		
		//calculamos dia del mes para saber que dia empezar el calendario		
		diaInicioMes = calcularInicioMes(mes, anyo);
		//imprimimos espacios al inicio del calendario para que coincida el dia que empieza el mes
		semana = imprimirEspacios(diaInicioMes);
		
		for(int x=1;x<=calcularDias(mes);x++) {
			if(x<10) {
				System.out.print(" ");
			}
			System.out.print(x + " ");
			semana++;
			
			if(semana >= 7) {
				System.out.print("\n");
				semana=0;
			}
		}		
	}
	
	static int calcularDias(String mes) {
		
		int cantidadDias = 0;
		switch(mes) {
		case "Octubre":
			cantidadDias = 31;
			break;
		}
		return cantidadDias;
		
	}
	
	static int imprimirEspacios(String diaMes) {
		
		int pos = 0;
		
		switch(diaMes) {
		case "SUNDAY":
			System.out.print("   ");
			pos++;
		case "SATURDAY":		
			System.out.print("   ");		
			pos++;
		case "FRIDAY":
			System.out.print("   ");
			pos++;
		case "THURSDAY":
			System.out.print("   ");
			pos++;
		case "WEDNESDAY":
			System.out.print("   ");
			pos++;
		case "TUESDAY":
			System.out.print("   ");
			pos++;
		case "MONDAY":					
			break;
			
		}
		
		return pos;
				
	}
	
	static String calcularInicioMes(String mes, String año) throws ParseException {
		
		String numMes = "00";
		switch(mes){
		case "Octubre":
			numMes = "10";
			break;
		}
		
				
        String day = "01";
        String inputDateStr = String.format("%s/%s/%s", day, numMes, año);
        Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputDateStr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputDate);
        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        //System.out.println(dayOfWeek);
		
				
			
		
		return dayOfWeek;
		
	}
}


