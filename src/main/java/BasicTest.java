import redis.clients.jedis.Jedis;


public class BasicTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.8.202", 6379);
        jedis.set("qingshan", "2673");
        System.out.println(jedis.get("qingshan"));
        jedis.close();

    }
}
