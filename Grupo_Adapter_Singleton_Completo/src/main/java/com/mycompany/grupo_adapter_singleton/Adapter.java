
package com.mycompany.grupo_adapter_singleton;
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();
    public void request(){ adaptee.specificRequest(); }
}
