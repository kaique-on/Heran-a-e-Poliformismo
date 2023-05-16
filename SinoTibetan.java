class SinoTibetan extends Linguagem{
    
    public SinoTibetan(String nome, double numFalantes, String origem) {
        super(nome, numFalantes, "Asia", "sujeito-objeto-verbo", origem);
        if (origem.contains("chinesa")){
            ordemDasPalavras = "sujeito-verbo-objeto";
        }
    }
   
}
