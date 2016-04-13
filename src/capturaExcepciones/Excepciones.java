package capturaExcepciones;

import java.util.Scanner;

public class Excepciones 
{
	public static void main(String[] args)
	{
		final int NUM = 5;
		int[] enteros = new int[NUM];
		int posicion = 0;
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int divisor = 0;
		while(cont < NUM)
		{
			try
			{
				System.out.print("Introduce una posici�n del array:");
			    posicion = Integer.parseInt(sc.nextLine());
			    System.out.print("Introduce un divisor:");
			    divisor = Integer.parseInt(sc.nextLine());
			    enteros[posicion] = 5 / divisor;
			    cont++;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Los datos deben ser n�meros enteros.");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("Posici�n inv�lida.");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divisi�n por cero no permitida.");
			}
		}
		sc.close();
		System.out.println("El contenido del array de enteros es:");
		for(int valor : enteros)
		  System.out.println(valor);
	}
}