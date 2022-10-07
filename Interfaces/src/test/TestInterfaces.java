package test;

import accesodatos.IAccesoDatos.*;
import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        
        //Desde MySql
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.insertar();
        imprimir(datos);
        //Desde Oracle
        datos = new ImplementacionOracle();
        //datos.insertar();
        imprimir(datos);
    }
    
    //Hacemos un metodo de tipo interface 
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
