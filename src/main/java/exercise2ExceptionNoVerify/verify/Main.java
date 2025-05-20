package exercise2ExceptionNoVerify.verify;

import exercise2ExceptionNoVerify.exception.MenorDeEdadException;
import exercise2ExceptionNoVerify.exception.NoPuedeSerNumeroNegativoException;

import java.util.Scanner;

public class Main {

    public static void verificarEdad(int edad){
        if(edad <18 && edad>0) {
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


