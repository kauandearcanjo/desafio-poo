public class Cliente {
    String nomeCompleto;
    int mesa;


    Cliente(String nomeCompleto, int mesa){
        this.mesa = mesa;
        this.nomeCompleto = nomeCompleto;

    }

    public String getNomeCompleto() {
        if (this.nomeCompleto == null) {
            return "Nome não informado";
        }
            String[] primeiroNome = this.nomeCompleto.split(" ");
            return primeiroNome[0];
        }
        public String nomeMaiusculo(){
            return this.nomeCompleto.toUpperCase();
        }
}


