public class Codec {
    
    HashMap<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String str = generateRandomString();
        map.put(str, longUrl);
        return str;
    }

    String generateRandomString(){
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < 5; i++){
            int k = (int)(Math.random()*26);
            str.append((char)('a' + k));
        }
        if(!map.containsKey(str.toString()))
            return str.toString();
        else
            return generateRandomString();
    }
    
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

// Code by Md Zaid Alam