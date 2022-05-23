import java.util.regex.Matcher;
	import java.util.regex.Pattern;

public class Regex1 {
	
	
	  public static void main(String[] args) {
	    Pattern pattern = Pattern.compile("2samiksha8", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("2samiksa8  is a good girl!");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	  }
	}

