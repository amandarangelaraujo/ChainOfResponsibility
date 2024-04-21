
public abstract class BaseHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Compra compra) {
        if (nextHandler != null) {
            nextHandler.handleRequest(compra);
        }
    }
}





