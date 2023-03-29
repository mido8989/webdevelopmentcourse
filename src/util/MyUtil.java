package util;

public class MyUtil {
	/* Color */
	public final String BLACK      = "\033[90m";
	public final String RED        = "\033[91m";
	public final String GREEN      = "\033[92m";
	public final String YELLOW     = "\033[93m";
	public final String BLUE       = "\033[94m";
	public final String MAGENTA    = "\033[95m";
	public final String CYAN       = "\033[96m";
	public final String WHITE      = "\033[97m";
	
	public final String REDBG      = "\033[101m";
	public final String GREENBG    = "\033[102m";

	/* Style */
	public final String BOLD             ="\033[1m";
	public final String INTENITY         ="\033[2m";
	public final String ITALIC           ="\033[3m";
	public final String UNDERLINE        ="\033[4m";
	public final String NEGATIVE         ="\033[7m";
	public final String CROSSEDOUT       ="\033[9m";
	public final String DOUBLEUNDERLINE  ="\033[21m";

	public final String END = "\033[0m";
	
	public void p(String str) {
		System.out.println(str);
	}

}
