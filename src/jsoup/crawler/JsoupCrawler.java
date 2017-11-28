package jsoup.crawler;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author elliot
 */
public class JsoupCrawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // URL its crawling. 
        Document doc = Jsoup.connect("http://blog.caplin.com/2017/10/17/takeaway-garbage-from-jax-london/").get();

        //String title = doc.title();
        // System.out.println("title : " +title); 
        
        // Selects the whole html post. 
        Elements info = doc.select("div#thePost");
        
      // Elements info = doc.select("p"); - Misses out content in bullet points.
        
        for(Element post: info)
        {
            
            post.select("script").remove();
            post.select("div").remove();
           System.out.println("Page Content: "+post);
 
        }
        
        // convert jsoup object into array
        
        
        
        // Count array where first char is S/s
    }
    
}
