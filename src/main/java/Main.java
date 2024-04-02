import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {

        //example 1
        Document document = Jsoup.connect("https://www.ctrs.com.ua/televizory/ue43cu7100uxua-samsung-719417.html")
                .get();
        Element element = document.selectFirst("div.price");  // <div class="price medium no-wrap f-secondary Price_price__KKCnw" data-price="17499">17&nbsp;499 <span class="medium Price_priceCurrency__kyMmb">₴</span></div>
        String price = element.text();
        System.out.println("price = " + price);

        //example 2
//        Document document = Jsoup.connect("https://allo.ua/ua/televizory/televizor-xiaomi-tv-a2-32.html")
//                .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36")
//                .get();
//        Element element = document.selectFirst("span.sum");
//        String price = element.text();
//        System.out.println("price = " + price);

        //example 3
//        Document document = Jsoup.connect("https://rozetka.com.ua/247925749/p247925749/")
//                .get();
//        Element element = document.selectFirst("p.product-price__big");
//        String price = element.text();
//        System.out.println("price = " + price);

    }
}
