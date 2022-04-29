package practicoexperimental1;
public class Racional {
    int numerador;
    int denominador;
    
    public Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador ; 
    }
    
    String toTexto(){
        return String.format("%d/%d",numerador, denominador);    
    }
    
    float toReal(){
        return (float)numerador/denominador;    
    }
    
    String euclides(int numerador, int denominador){
        if (denominador == 0){ 
            return String.format("%d/%d",this.numerador/numerador, 
                    this.denominador/numerador);          
        }
        
        return euclides(denominador, numerador%denominador); 

    }

}
