package pipeline;

import redis.clients.jedis.Jedis;


public class MultiTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.8.211", 6379);
        long start = System.currentTimeMillis();
        for(int i =0; i< 10000; i++){
            jedis.set("key"+i, i+"");
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end -start ) +"毫秒");
        jedis.close();
    }

}
