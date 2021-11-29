import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class main {
    public static String IMAGE_DESTINATION_FOLDER = "D:/images";

    public static void main(String[] args) {
        String url = "https://truyenfull.vn/danh-sach/truyen-hot//";

        try {
            Document document = Jsoup.connect(url).get();
            Elements elements = document.select("div.row");

            for(Element i : elements) {
//                System.out.println(i);
                System.out.println(i.select("div.col-xs-2.text-info div a").text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//     public static void downloadImage(String strImageURL){
//
//        //get file name from image path
//        String strImageName =
//                strImageURL.substring( strImageURL.lastIndexOf("/") + 1 );
//
//        System.out.println("Saving: " + strImageName + ", from: " + strImageURL);
//
//        try {
//
//            //open the stream from URL
//            URL urlImage = new URL(strImageURL);
//            InputStream in = urlImage.openStream();
//
//            byte[] buffer = new byte[4096];
//            int n = -1;
//
//            OutputStream os =
//                    new FileOutputStream( IMAGE_DESTINATION_FOLDER + "/" + strImageName );
//
//            //write bytes to the output stream
//            while ( (n = in.read(buffer)) != -1 ){
//                os.write(buffer, 0, n);
//            }
//
//            //close the stream
//            os.close();
//
//            System.out.println("Image saved");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}