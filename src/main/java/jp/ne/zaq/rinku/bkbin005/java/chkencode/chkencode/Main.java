/**
 *
 */
package jp.ne.zaq.rinku.bkbin005.java.chkencode.chkencode;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Encode checker main.
 * @author Mitsutoshi NAKANO bkbin005@rinku.zaq.ne.jp
 *
 */
public class Main {
  /** instanse.  */
  private static ChkEncode instanse = new ChkEncode();

  /**
   * main.
   * @param args
   * @throws IOException
   * @throws FileNotFoundException
   */
  public static void main(String[] args) throws FileNotFoundException, IOException {
    instanse.checkAll(args);
  }
}
