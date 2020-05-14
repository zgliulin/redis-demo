package pubsub;

import redis.clients.jedis.Jedis;

public class ListenTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.8.211", 6379);
        final MyListener listener = new MyListener();
        // 使用模式匹配的方式设置频道
        // 会阻塞
        jedis.psubscribe(listener, new String[]{"qingshan-*"});
    }
}
