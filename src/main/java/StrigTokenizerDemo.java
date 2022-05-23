import java.util.StringTokenizer;

public class StrigTokenizerDemo {

	
	    public static void main(String[] args) {
	        String url = "Sami Love u";
	        StringTokenizer multiTokenizer = new StringTokenizer(url);
	        while (multiTokenizer.hasMoreTokens()) {
	            System.out.println(multiTokenizer.nextToken());
	        }
	    }
	}

