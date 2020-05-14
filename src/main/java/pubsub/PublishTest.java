package pubsub;

import redis.clients.jedis.Jedis;


public class PublishTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.8.211", 6379);
        jedis.publish("qingshan-123", "666");
        jedis.publish("qingshan-abc", "盆鱼宴");
    }
}
