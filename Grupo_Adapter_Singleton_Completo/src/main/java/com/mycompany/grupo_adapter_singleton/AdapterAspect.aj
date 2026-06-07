
package com.mycompany.grupo_adapter_singleton;
public aspect AdapterAspect {
    before(): execution(* Adapter.request(..)){
        System.out.println("[AOP] Adapter ejecutado");
    }
}
