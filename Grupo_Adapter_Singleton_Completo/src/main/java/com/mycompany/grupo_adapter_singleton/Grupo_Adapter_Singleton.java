
package com.mycompany.grupo_adapter_singleton;

public class Grupo_Adapter_Singleton {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.request();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Misma instancia: " + (s1 == s2));
    }
}
