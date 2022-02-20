package clases;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Persona {

    private String nombre;
    private Integer edad;
    private String NSS;
    private final String sexo;
    private Double peso;
    private Double altura;

    public Persona(String nombre, Integer edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNSS() {
        return generarNSS();
    }

    public String getSexo() {
        return sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer calcularIMC() {
        int datoAretornar = 0;
        double calculoPeso = peso/Math.pow(altura/100, 2);
        switch (sexo){
            case "H":
                if (calculoPeso < 20){
                    datoAretornar = -1;
                } else if(calculoPeso > 25){
                    datoAretornar = 1;
                }
                break;
            case "M":
                if (calculoPeso < 19){
                    datoAretornar = -1;
                } else if (calculoPeso > 24){
                    datoAretornar = 1;
                }
                break;

        }
        return datoAretornar;
    }

    public boolean esMayorDeEdad() {
        return edad > 17;
    }

    private boolean comprobarSexo(String sexo){
        return sexo.equals("H") || sexo.equals("M");
    }

    @Override
    public String toString() {
        return "Información: {" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", NSS=" + generarNSS() +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String generarNSS() {
        int numeroCaracteres = 8;
        byte[] bytearray;
        bytearray = new byte[256];
        String mystring;
        StringBuilder thebuffer;
        String theAlphaNumericS;

        new Random().nextBytes(bytearray);

        mystring = new String(bytearray, StandardCharsets.UTF_8);

        thebuffer = new StringBuilder();

        theAlphaNumericS = mystring.replaceAll("[^A-Z0-9]", "");

        for (int m = 0; m < theAlphaNumericS.length(); m++) {

            if (Character.isLetter(theAlphaNumericS.charAt(m))
                    && (numeroCaracteres > 0)
                    || Character.isDigit(theAlphaNumericS.charAt(m))
                    && (numeroCaracteres > 0)) {

                thebuffer.append(theAlphaNumericS.charAt(m));
                numeroCaracteres--;
            }
        }
        return thebuffer.toString();
    }
}
