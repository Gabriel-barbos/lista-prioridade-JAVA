public class FilaPrioridade {
    
    private No fim;
    private No inicio;
    private int tamanho;
    private int prioriade;


    //METODO ESTA VAZIA

    public boolean estaVazia(){
        return tamanho == 0;
    } 

    //METODO BUSCAR INICIO DA FILA 

    public Object inicio() {
        if(estaVazia()){
            return null;
        }
        return this.inicio.info;
    }

    //METODO ENFILEIRAR 

    public void enfileirar(Object info, int prioridade) {
        No no = new No (info);

        if(estaVazia()) {
            inicio = no;
        }else{
            fim.prox = no;
        }
        fim = no;
        tamanho++;

        if (inicio == null || prioridade > inicio.prioridade) {
            No.prox = primeiro;
            primeiro = novoNodo;
        } else {
            
    }

        //METODO DESENFILEIRAR 


    public Object desenfileirar() {
        if(estaVazia()){
            return null;
        }
        Object info = inicio();
        inicio = inicio.prox;
        tamanho--;
        return inicio.info;
    }


}
