public class Produto extends SQLClass{            
    @Key
    int id;
    String fabricante;
    String nome;
    String tipo;
    int quantidade;    

    Produto(){
        this.setTableName("produtos");        
    }    
}
