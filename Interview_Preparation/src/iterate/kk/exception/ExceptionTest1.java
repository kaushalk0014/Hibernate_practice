package iterate.kk.exception;

public class ExceptionTest1 {

	@SuppressWarnings({ "finally", "unlikely-arg-type" })
	private static String testException(){
		try {
			System.out.println("---------------try---------------");
			int a=3/0;
			return "try";
		} catch (Exception e) {
			System.out.println("---------------catch---------------");
			e.printStackTrace();
			return "catch";
		}finally {
			System.out.println(Boolean.FALSE+"    ---:  "+Boolean.FALSE.equals("false") );
			
			System.out.println("---------------finally---------------");
			return "finally";
		}
	}
	public static void main(String[] args) {
		System.out.println("==========:  "+ExceptionTest1.testException());
	}
}
