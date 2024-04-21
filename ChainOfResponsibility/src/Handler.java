public interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(Compra compra);
}