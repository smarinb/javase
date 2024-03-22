package clases;

public class Vehiculo {

    // 01. Atributos

    private String marca;
    private String modelo;
    private Double cc;
    private int speed;
    private int year;
    private boolean sport;


    // 02. Constructor
    public Vehiculo(){

    }

    public Vehiculo(String marca, String modelo, Double cc, int year, boolean sport){
        this.marca = marca;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;
    }

    // 03. Métodos
    public void acelerar(int velocidad){
        this.speed += velocidad;
    }

    public void imprimirVehiculo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("CC: " + this.cc);
        System.out.println("Año: " + this.year);
        System.out.println("Sport: " + this.sport);
        System.out.println("Velocidad: " + this.speed);
    }

    //getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCc() {
        return cc;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCc(Double cc) {
        this.cc = cc;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }
}
