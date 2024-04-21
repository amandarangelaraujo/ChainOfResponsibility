
public class Main {
    public static void main(String[] args) {
        // Crie os manipuladores
        Handler validadorEstoqueHandler = new ValidadorEstoqueHandler();
        Handler calculadoraDescontoHandler = new CalculadoraDescontoHandler();
        // Crie outros manipuladores conforme necessário

        // Configure a cadeia de responsabilidade
        validadorEstoqueHandler.setNextHandler(calculadoraDescontoHandler);
        // Configure a cadeia adicionando outros manipuladores

        // Inicie o processo de compra
        Compra compra = new Compra(/* Informações da compra */);
        validadorEstoqueHandler.handleRequest(compra);
    }
    
}