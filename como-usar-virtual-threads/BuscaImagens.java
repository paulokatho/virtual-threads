import java.util.concurrent.CompletableFuture;

//Esse código não usa as velhas e boas blocking APIs
//Não é a melhor forma ou a forma indicada para se utilizar virtual threads

public class BuscaImagens {

    public static void main(String[] args) {
        CompletableFuture.supplyAsync(info::getUrl, pool)
            .thenCompose(url -> getBodyAsync(url, HttpResponse.BodyHandlers.ofString()))
            .thenApply(info::findImage)
            .thenCompose(url -> getBodyAsync(url, HttpResponse.BodyHandlers.ofByteArray()))
            .thenApply(info::setImageData)
            .thenAccept(this::process)
            .excptionally(t -> { t.printStackTrance(); return null; });
    }
}