
package aula1_estrutura;
class TesteRecursivo {
    public int testeRecursivoOrder(int x){
        
        if (x == 0)
            return 1;
        
        return 3 * testeRecursivoOrder (x - 1);
    }
    
}
