class Linguagem {
    protected String nome;
    protected double numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;
    protected String origem; 

    public Linguagem(String nome, double numFalantes, String regioesFaladas, String ordemDasPalavras, String origem){ // um construtor indica as variáveis que vão ser declaradas para a construção do objeto
            this.nome = nome;
            this.numFalantes = numFalantes;
            this.regioesFaladas = regioesFaladas;
            this.ordemDasPalavras = ordemDasPalavras;
            this.origem = origem;
        }

    public void getInfo() {
        System.out.println(nome + " tem origem " + origem + ", e falado por "+ numFalantes + " pessoas, principalmente em "+ regioesFaladas+"."+"\nA linguagem segue a ordem das palavras: "+ordemDasPalavras+".\n");
    }

    public static void main(String[] args) {
        Linguagem Ingles = new Linguagem("Ingles", 134800000 , "Inglaterra, EUA , Canada, Nova Zelandia", "verbo, adjetivo, substantivo", "inglesa");
        Linguagem Espanhol = new Linguagem("Espanhol",  538000000, "Espanha, Argentina, México, Venezuela", "sujeito-verbo-objeto", "espanola");
        Mayan Kiche = new Mayan("Kiche", 300000, "maia");
        SinoTibetan Mandarim = new SinoTibetan("Mandarim", 1120000, "chinesa");
        SinoTibetan Birmanes = new SinoTibetan("Birmanes", 200000, "sino tebetana");
        Ingles.getInfo();
        Espanhol.getInfo();
        Kiche.getInfo();
        Mandarim.getInfo();
        Birmanes.getInfo();
    }
}