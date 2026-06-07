
package com.mycompany.grupo_adapter_singleton;
public aspect SingletonAspect {
    before(): call(* Singleton.getInstance(..)){
        System.out.println("[AOP] Singleton solicitado");
    }
}
