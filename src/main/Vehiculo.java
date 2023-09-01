package main;


public class Vehiculo {
    
    private String Marca;
    private int Año;
    private double Precio;
    private int CapEstanque;
    private int NivEstanque;
    
    public Vehiculo(String Marca, int Año, double Precio, int CapEstanque, int NivEstanque) {
    this.Marca = Marca;
    this.Año = Año;
    this.Precio = Precio;
    this.CapEstanque = CapEstanque;
    this.NivEstanque = NivEstanque;
    }
    
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    public void setAño(int Año){
        this.Año = Año;
    }
    public void setPrecio(double Precio){
        this.Precio = Precio;
    }
    public void setCapEstanque(int CapEstanque){
        this.CapEstanque = CapEstanque;
    }
    public void setNivEstanque(int NivEstanque){
        this.NivEstanque = NivEstanque;
    }
    
    public String getMostrarMarca(){
        return Marca;
    }
    public int getMostrarAño(){
        return Año;
    }
    public double getMostrarPrecio(){
        return Precio;
    }
    public int getMostrarCapEstanque(){
        return CapEstanque;
    }
    public int getMostrarNivEstanque(){
        return NivEstanque;
    }
    
    public void ImprimirDatos(String Marca, int Año,double Precio){
        this.Marca = Marca;
        this.Año = Año;
        this.Precio = Precio;
    }
    
    public void CargarEstanque(int CapEstanque,int NivEstanque, int litros){
        this.CapEstanque = CapEstanque;
        this.NivEstanque = NivEstanque;
        if(this.NivEstanque < this.CapEstanque){
            this.NivEstanque = NivEstanque + litros;
        }} 
    /**public void VaciarEstanque(int NivEstanque,int litros){
    }*/
        
    }
    

