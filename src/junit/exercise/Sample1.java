package junit.exercise;

public class Sample1 {
	
	/**
	 * 引数で渡された配列内の文字列を連結して返却する
	 * 
	 * @param strArray 連結したい文字列を格納した配列
	 * @return
	 */
	public String joinString(String[] strArray) {
		// 返却する文字列
		String joinedStr = "";
		
		// 文字列を連結
		StringBuilder sb = new StringBuilder();
		
		// 拡張for文
		for (String str : strArray) {
			sb.append(str);
		}
		
		joinedStr = sb.toString();
		
		return joinedStr;
	}
}
