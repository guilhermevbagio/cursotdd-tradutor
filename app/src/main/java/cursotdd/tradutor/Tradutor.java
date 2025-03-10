package cursotdd.tradutor;
import java.util.Map;
import java.util.HashMap;

public class Tradutor {
    private Map<String, String> traducoes = new HashMap<>();

    public boolean estaVazio() {
        return traducoes.isEmpty();
    }

    public void adicionaTraducao(String palavra, String traducao){
        if(traducoes.containsKey(palavra)){
            traducao = traduzir(palavra) + ", " + traducao;
        }
        traducoes.put(palavra, traducao);
    }

    public String traduzir(String arg){
        return traducoes.get(arg);
    }
    private String primeiraTraducao(String palavra){
        String traducao = traduzir(palavra);
        if(traducao.contains(","))
            return traducao.substring(0, traducao.indexOf(",")) + " ";
        else
            return traducao + " ";
    }
    public String traduzirFrase(String frase){
        String[] palavras = frase.split(" ");
        String fraseTraduzida = "";
        for(String palavra : palavras){
            fraseTraduzida += primeiraTraducao(palavra);
        }
        return fraseTraduzida.trim();
    }
    


}