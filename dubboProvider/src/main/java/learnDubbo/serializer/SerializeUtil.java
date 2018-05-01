package learnDubbo.serializer;

/**
 * Created by win on 2018/4/24.
 */
public interface SerializeUtil {
    byte[] Object2byte(Object obj) throws Exception;
    Object byte2object(byte[] b) throws Exception;

}
