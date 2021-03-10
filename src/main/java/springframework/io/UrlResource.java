package springframework.io;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * 通过Url的方式获取资源
 *
 * Created by xieli on 2021/3/10.
 */
public class UrlResource implements Resource {

    private URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws Exception {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
