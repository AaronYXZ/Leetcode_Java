package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/encode-and-decode-tinyurl/description/
TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.

Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
https://leetcode.com/problems/encode-and-decode-tinyurl/solution/
approach 3 Using hashcode
 */
public class L535_EncodeAndDecodeTinyURL {
    Map<Integer, String> map = new HashMap<>();

    public String encode(String longUrl){
        map.put(longUrl.hashCode(), longUrl);
        return "https://tinyurl.com/" + longUrl.hashCode();
    }

    public String decode(String shortUrl){
        return map.get(Integer.parseInt(shortUrl.replace("https://tinyurl.com/", "")));
    }
}
