package exercise1Exception.verify;

import exercise1Exception.exception.MenorDeEdadException;
import exercise1Exception.exception.NoPuedeSerNumeroNegativoException;

import java.util.Scanner;

public class Main {

    public static void verificarEdad(int edad) throws MenorDeEdadException, NoPuedeSerNumeroNegativoException {
        if(edad <18) {
            throw new MenorDeEdadException("No podes entrar por ser menor de edad");

        }else if(edad <0){
            throw new NoPuedeSerNumeroNegativoException("No puede ser un número negativo");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("me podes decir tu edad por favor");
        int edad = sc.nextInt();

        try {
            verificarEdad(edad);

        } catch (MenorDeEdadException e) {
            System.out.println("Error " + e.getMessage());

        } catch (NoPuedeSerNumeroNegativoException e) {
            System.out.println(" Error " + e.getMessage());
        }
        sc.close();
    }

    }


