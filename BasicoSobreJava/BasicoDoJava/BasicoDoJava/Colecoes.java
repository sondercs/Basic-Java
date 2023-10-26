package BasicoDoJava;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {

    public static void main(String[] args) {
        Map<String, Integer> notas =  new HashMap<>();
        notas.put("Dani", 10);
        notas.put("Joao", 8);
        notas.put("Maria", 9);

        for(Map.Entry<String, Integer> entry: notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
            
        }

    }
}
