
package com.mycompany.grupo_adapter_singleton;
public class Singleton {
    private static Singleton instancia;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instancia==null) instancia=new Singleton();
        return instancia;
    }
}
