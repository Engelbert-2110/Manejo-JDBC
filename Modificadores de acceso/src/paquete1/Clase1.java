package paquete1;

class Clase1 {
    //Atributo 
    private String atributoprivado = "Atributo privadoo";
    
    //contructor
    private Clase1(){   
        System.out.println("Contructooor privado");
    }
     
    public Clase1(String tipoAcceso){
        this();                  //Llamamos el constructor privado para usarlo en clases hijas 
        System.out.println("ContructOor publico");
        metodoprivado();
    }
    //Metodo
    private void metodoprivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoprivado() {
        return this.atributoprivado;
    }

    public void setAtributoprivado(String atributoprivado) {
        this.atributoprivado = atributoprivado;
    }
    
    
}
