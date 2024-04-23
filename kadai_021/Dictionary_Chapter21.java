package text.kadai_021;
import java.util.HashMap;
public class Dictionary_Chapter21 {

	public void dictionary(String [] word) {
		HashMap<String,String>Dictionary=new HashMap<String,String>();
		
		Dictionary.put("apple","りんご");
		Dictionary.put("peach", "桃");
		Dictionary.put("banana", "バナナ");
		Dictionary.put("lemon","レモン");
		Dictionary.put("pear","梨");
		Dictionary.put("kiwi","キウィ");
		Dictionary.put("strawberry","いちご");
		Dictionary.put("greap","ぶどう");
		Dictionary.put("muscat","マスカット");
		Dictionary.put("charry","さくらんぼ");
		
		for(int i=0;i<word.length;i++) {
			
			
		if (null !=Dictionary.get(word[i])) {
			System.out.println(word[i]+"の意味は"+Dictionary.get(word[i]));
			
		}else{
			System.out.println(word[i]+"は辞書に存在しません");
		}
	}
}
}