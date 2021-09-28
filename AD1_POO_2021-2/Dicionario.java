public class Dicionario extends Salvavel{
    int ind_array;
    final int MAX_DIC = 1000;
    Chave[] chaves;
    Valor[] valores;

    public Dicionario(){
        chaves = new Chave[MAX_DIC];
        valores = new Valor[MAX_DIC];
        ind_array = 0;

    }

    public void setValor(Chave chave, Valor valor){

        chaves[ind_array] = chave;
        valores[ind_array]= valor;
        ind_array++;
    }

    public Valor getValor(Chave chave){ //Método que procura o valor que está associado à chave passada.
        Valor result = null;
        try{
            for(int i = 0; i < chaves.length; i++){
                if(chaves[i].name.equals(chave.name)){
                    result = valores[i];
                    break;
                }
            }
        return result;
        }

        catch(Exception e){
            System.out.println("Chave nao encontrada");
            return null;
        }

    }

    public void delValor(Chave chave){ //Método para deletar a chave passada e o valor associado a ela.
        Chave[] newChaves = new  Chave[chaves.length - 1];
        Valor[] newValores = new Valor[valores.length - 1];
        int index = chaves.length;
        for(int i = 0; i < chaves.length; i++){ //Encontra o índice da chave que foi passada
            if(chaves[i].name.equals(chave.name)){
                index = i;
                break;
            }
        }

        if(index == chaves.length)
            return;
        for (int i = 0, j = 0; i < chaves.length; i++){ //Retira o valor da lista
            if(i != index){
                newChaves[j] = chaves[i];
                newValores[j] = valores[i];
                j++;
            }
        }
        ind_array--;
        chaves = newChaves;
        valores = newValores;


    }

    public String toString(){
        String result = "";
        for(int i = 0; i < ind_array; i++){
             result += (chaves[i] + "=" + valores[i] + "\n");
        }
        return result;
    }

    public String toJson(){ // Método toJson conforme foi pedido da AD
        String result = "";
        for(int i = 0; i < ind_array; i++){
            if(result != ""){
                result += ",";
            }

            result += ("\"" + chaves[i] + "\""+ ":" + "\"" + valores[i] + "\"");
       }
       return("{" + result + "}");
    }



}
