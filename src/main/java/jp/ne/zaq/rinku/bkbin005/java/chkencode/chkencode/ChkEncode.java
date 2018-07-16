/**
 *
 */
package jp.ne.zaq.rinku.bkbin005.java.chkencode.chkencode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.mozilla.universalchardet.UniversalDetector;

/**
 * Encode checker.
 * @author Mitsutoshi NAKANO bkbin005@rinku.zaq.ne.jp
 */
public class ChkEncode {

  /**
   * Check all files.
   * @param filenames file name
   * @throws FileNotFoundException file not found
   * @throws IOException others IO exceptions.
   */
  public void checkAll(String[] filenames) throws FileNotFoundException, IOException {
    for (String fname : filenames) {
      String encoding = check(fname);
      sayEncoding(fname, encoding);
    }
  }

  /**
   * Check encoding.
   * @param fname file name.
   * @return encoding name.
   * @throws FileNotFoundException file not found.
   * @throws IOException others IO exceptions.
   */
  String check(String fname) throws FileNotFoundException, IOException {
    return UniversalDetector.detectCharset(new File(fname));
  }

  /**
   * Say encoding.
   * @param fname file name.
   * @param encoding encoding name.
   */
  void sayEncoding(String fname, String encoding) {
    System.out.print((encoding != null) ? encoding : "UnKnown");
    System.out.print(" ");
    System.out.println(fname);
  }
}
