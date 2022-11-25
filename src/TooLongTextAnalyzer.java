public class TooLongTextAnalyzer {

    final int maxLengs = 100;

    private Label longLength (String a) {

      return a.length() < maxLengs ? Label.OK : Label.TOO_LONG;

    }

}
