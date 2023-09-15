<<<<<<< HEAD
package day15;

public class Exception04 {

	public static void main(String[] args) {
		// 멀티 캐치
		/* try{
		 *    code...
		 * } catch(하위예외클래스 Exception e){
		 * 		
		 * } catch(하위예외클래스 Exception e){
		 * 		
		 * } catch(하위예외클래스 Exception e){
		 * 		
		 * } catch(하위예외클래스 Exception e){
		 * 		
		 * }
		 * */
		
		try {
			//int res = 1/0;
			//System.out.println(res);
			int arr1[] = new int[5];
			//int arr1[] = null;
			arr1[6] = 1;
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
			System.out.println("예외발생");
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("배열의 범위가 넘어갔습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}
=======
package day15;

public class Exception04 {

	public static void main(String[] args) {
		// 멀티 캐치
		/* try{
		 *    code...
		 * } catch(하위예외클래스 Exception e){
		 * 		
		 * } catch(하위예외클래스 Exception e){
		 * 		
		 * } catch(하위예외클래스 Exception e){
		 * 		
		 * } catch(하위예외클래스 Exception e){
		 * 		
		 * }
		 * */
		
		try {
			//int res = 1/0;
			//System.out.println(res);
			int arr1[] = new int[5];
			//int arr1[] = null;
			arr1[6] = 1;
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
			System.out.println("예외발생");
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("배열의 범위가 넘어갔습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
