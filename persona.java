/*Cree una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: nombre, edad, cedula, sexo (H hombre, M mujer), peso y altura.

Por defecto, todos los atributos menos la cedula serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, use una constante para esto.

Debe implementar varios constructores:

Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.

Los métodos que debe implementar son:

calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Como recomendacion usar constantes para devolver los valores.

esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.

comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H.

toString(): devuelve toda la información del objeto.

generaCedula(): genera un número aleatorio de 10 digitos. Este método sera invocado cuando se construya el objeto.

Métodos get y set de cada atributo.

Ahora, cree los siguientes casos de prueba (Test) que hagan lo siguiente:

Caso1: Crea 3 objetos con valores que usted defina, y pregunte en los casos de prueba que tenga cada objeto los valores esperados.
Caso2: Para cada objeto del caso anterior, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal.
Caso3: Para cada objeto del caso1, probar si es mayor de edad. */

public class persona {

    //atributos
    private String nombre;
    private byte edad;
    private char sexo;
    private String cedula;
    private byte peso;
    private double altura;

// contructor de defecto, contructor vacio

    public persona() {

    }

//Un constructor con el nombre, edad y sexo, el resto por defecto
    public persona(String nombre, byte edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = " ";
        this.peso = 0;
        this.altura = 0.0;
    }
//Un constructor con todos los atributos como parámetro.

    public persona(String nombre, byte edad, char sexo, String cedula, byte peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = cedula;
        this.peso = peso;
        this.altura = altura;
    }

//metodos

public int calcularImc (double peso, double altura ){
    int pesoBajo = -1;
    int pesoIdeal =0;
    int sobrePeso = 1;
    if(peso/Math.pow(altura,2)<20){
    System.out.println("IMC < a 20, Desnutricion");
    return pesoBajo;
}
    if(peso/Math.pow(altura,2)>=20 && peso/Math.pow(altura,2) <=25 ){
        System.out.println("IMC entre 20 y 25, esta por debajo del peso ideal");
    return pesoIdeal ;
    }
    else{
        System.out.println("IMC mayor a 25 , presenta sobrepeso");
        return sobrePeso;
    }


}

//metodo esMayorDeEdad()
    public boolean esMayorDeEdad (int edad){
        if(edad<18){
        return false;
        }
        else{
        return true;

        }

}
//comprobarSexo(char sexo)
    public void comprobarSexo (char sexo){
    if (sexo != 'H' && sexo != 'M') {
            sexo = 'H';
        }
        System.out.println("El sexo es: " + sexo);
    }

    public int generacionCedula (){
        int cedula= (int) ((double) Math.random()*1000000000);   
        return cedula;
}

}
