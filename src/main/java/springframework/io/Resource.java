package springframework.io;

import java.io.InputStream;

/**
 * 获取资源（配置文件）的接口
 * Created by xieli on 2021/3/10.
 */
public interface Resource {

    /**
     * 通过输入流的方式获取资源
     * @return 待获取资源的输入流
     * @throws Exception IO异常
     */
    InputStream getInputStream() throws Exception;

}
