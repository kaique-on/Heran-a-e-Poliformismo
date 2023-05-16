class Mayan extends Linguagem{

    public Mayan(String nome, double numFalantes, String origem) {
        super(nome, numFalantes, "America Central", "verbo-objeto-sujeito", origem);
    }
    
    @Override
    public void getInfo() {
        System.out.println(nome + " tem origem " + origem + " e falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas + " A linguagem segue a ordem das palavras: " + ordemDasPalavras + "\nFato interessante: " + nome + " e uma lingua ergativa.\n");
    }
}
