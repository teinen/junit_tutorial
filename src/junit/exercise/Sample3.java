package junit.exercise;

public class Sample3 {
	
	/**
	 * xをyで除算した結果を返却する
	 * 余りがあった場合は、その余りを返却する
	 * 
	 * 引数のいずれかが0であった場合、例外をスローする
	 * 
	 * @param x 第１引数
	 * @param y 第２引数
	 * @return 除算結果もしくは余り
	 */
	public int devide(int x, int y) {
		// どちらかの引数が0だった場合、例外をスロー
		if (x == 0 || y== 0) {
			throw new IllegalArgumentException("0は除算対象に出来ません");
		}
		
		// 余りがある場合余りを返却
		if (x % y != 0) {
			return x % y;
		}
		
		return x / y;
	}

}
