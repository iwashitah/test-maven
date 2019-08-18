package iwashita.example.hello;
import org.apache.commons.fileupload.MultipartStream;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.mindrot.jbcrypt.BCrypt;
import java.io.ByteArrayInputStream;
/**
 * Maven Artifactoryプラグイン連携確認
 * @author Iwashita
 * @version 1.2
 */
public class Hello {
	/**
	 * メインメソッド
	 * @param args 標準入力用文字列
	 * @throws Exception 例外
	 */
  public static void main(String[] args) throws Exception {
    String candidate = args[0];
    String hashed = BCrypt.hashpw(candidate, BCrypt.gensalt(12));

    BCrypt.checkpw(candidate, hashed);

    filterXMLSignature();
  }

  private static void filterXMLSignature() {
    byte[] bytes = new byte[256];

    new MultipartStream(new ByteArrayInputStream(bytes), bytes);

    new XMLSignatureInput(bytes).addNodeFilter(null);
  }
}
