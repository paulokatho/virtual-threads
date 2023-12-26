import java.net.http.HttpResponse;

//Esse código USA as velhas e boas blocking APIs
//Dessa forma vai utilizar todo potencial das virtual threads

public class BuscaImagensVirtualThreads {
    public static void main(String[] args) {
        
        try {
            String page = getBody(info.getUrl(), HttpResponse.BodyHandlers.ofString());
        String imageUrl = info.findImage(page);

        byte[] data = getBody(imageUrl, HttpResponse.BodyHandlers.ofByteArray());
        info.setImageData(data);

        process(info);    
        } catch (Exception e) {
            t.printStackTrace();
        }
        
    }
}
