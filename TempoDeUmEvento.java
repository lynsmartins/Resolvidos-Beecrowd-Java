package condicional;

import java.util.Scanner;

public class TempoDeUmEvento {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String dia_inicio, dia_fim;
		String tempo_inicio, tempo_fim;
		String dia_split_inicio[], dia_split_fim[],tempo_split_inicio[], tempo_split_fim[];
		int diaInicio, diaFim, hrInicio, hrFim, minInicio, minFim, segInicio, segFim;
		int dia = 0, hr = 0, min = 0, seg = 0;

		dia_inicio = leitor.nextLine();
		tempo_inicio = leitor.nextLine();

		dia_fim = leitor.nextLine();
		tempo_fim = leitor.nextLine();

		dia_split_inicio = dia_inicio.split(" ");
		diaInicio = Integer.parseInt(dia_split_inicio[1]);
		
		dia_split_fim = dia_fim.split(" ");
		diaFim = Integer.parseInt(dia_split_fim[1]);
		
		tempo_split_inicio = tempo_inicio.split(" : ");
		tempo_split_fim = tempo_fim.split(" : ");
		
		hrInicio = Integer.parseInt(tempo_split_inicio[0]);
		minInicio = Integer.parseInt(tempo_split_inicio[1]);
		segInicio = Integer.parseInt(tempo_split_inicio[2]);
		
		hrFim = Integer.parseInt(tempo_split_fim[0]);
		minFim = Integer.parseInt(tempo_split_fim[1]);
		segFim = Integer.parseInt(tempo_split_fim[2]);
		
		// segundos
		if(segFim >= segInicio) {
			seg = segFim - segInicio;
		}else {
			seg = segFim - segInicio + 60;
			minFim = minFim - 1;
		}
		
		// minutos
		if(minFim >= minInicio) {
			min = minFim - minInicio;
		}else {
			min = minFim - minInicio + 60;
			hrFim = hrFim - 1;
		}
		
		// horas
		if(hrFim >= hrInicio) {
			hr = hrFim - hrInicio;
		}else {
			hr = hrFim - hrInicio + 24;
			diaFim = diaFim - 1;
		}
		
		// dias
		if (diaFim >= diaInicio) {
            dia = diaFim - diaInicio;
        }
        System.out.println(dia + " dia(s)");
        System.out.println(hr + " hora(s)");
        System.out.println(min + " minuto(s)");
        System.out.println(seg + " segundo(s)");

	}
}
