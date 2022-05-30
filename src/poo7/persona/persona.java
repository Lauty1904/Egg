/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7.persona;

import java.util.Scanner;

/**Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
/**
 *
 * @author Ventas Electrouno
 */
public class persona {
    private String nombre;
    private String sexo;
    private int edad;
    private double altura;
    private double peso;

    public persona() {
    }

    public persona(String nombre, String sexo, double altura, double peso, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.edad= edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double isAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double isPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    Scanner read=new Scanner(System.in);
    
    public void crearpersona(){
        System.out.println("Ingrese el nombre de la persona: ");
        this.nombre=read.next();
        System.out.println("Ingrese el sexo de la persona: ");
        this.sexo=read.next();
    
        System.out.println("Ingrese el el peso de la persona: ");
        this.peso=read.nextDouble();
        System.out.println("Ingrese la altura de la persona: ");
        this.altura=read.nextDouble();
        System.out.println("Ingrese la edad de la persona: ");
        this.edad=read.nextInt();
    }
    
    public int calculo(){
        double imc=this.peso/(this.altura*this.altura);
        System.out.println("IMC: " +imc);
       if(imc<25&&imc>20){
           System.out.println("estado ideal!!");
       return 1;
       } else if(imc<20){
           System.out.println("Peso por debajo del ideal :(");
       return 0;
       }else 
           System.out.println("Sobrepeso!!");
       return -1;
      
    
    }
   
    public boolean mayor(){
    if(this.edad>=18){
        System.out.println("mayor de edad");
        return true;
    }else 
            System.out.println("Menor de edad");
        return false;
    }
            
}
