
# Recursividad
### _Ejemplo:_
```
method1(entranceParam){
    method1(otherParam)
return something
}
```
***
Siempre se debe de tener una condición de parada.

- Factorial:
```
factorial(param){
    int out;
    for(int i=0; i<= param; i++){
        int sum*=(param-i);
        out=sum;
    }
    return out;
}
```
- Factorial recursivo
```
factorialRecursive(param){
    if(param == 0){
        return 1;
    }
    return param*factorialRecursive(param-1);
}
```