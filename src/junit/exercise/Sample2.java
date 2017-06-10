package junit.exercise;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {
	
	/**
	 * 引数で渡された配列をリストにして返却する
	 * 配列内の文字列が空文字("")の場合は「空白」という文字列を追加する
	 * 
	 * @return
	 */
	public List<String> getList(String[] strArray) {
		// 返却するList
		List<String> list = new ArrayList<>();
		
		// リストに要素を格納
		for (String str : strArray) {
			// 空文字の場合、「空白」という文字を追加する
			if (str.equals("")) {
				list.add("空白");
			} else {
				list.add(str);	
			}
		}
		
		return list;
	}

}
