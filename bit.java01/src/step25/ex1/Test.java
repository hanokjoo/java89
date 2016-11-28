/* 의존 객체 관리 : 예전 방식
 * => 사용할 객체는 직접 생성해서 쓴다.
 * => 사용할 객체 
 *    = 이 객체가 없으면 작업을 할 수 없다 
 *    = "의존 객체(Dependency Object)"라 부른다.
 * => 시스템 규모가 작을 때는 의존 객체가 필요할 때 마다 생성해서 사용하면 된다.
 *    그러나 시스템 규모가 클 때, 매번 객체를 생성하게 되면 메모리 낭비가 심해진다.
 *    해결책? 의존 객체를 직접 만든 것이 아니라 외부로부터 주입을 받는 것이 좋다.
 *    의존 객체를 직접 관리하지 말고, 외부 관리자로부터 공급 받아 사용한다.
 *    이런 객체관리 방식을 "의존 객체 주입(Dependency Injection)"이라 한다.
 * => 제어의 역행(Inversion of Control; IoC)
 *    - 일반적인 흐름과 다른 행동 패턴을 말한다.
 *    - 대표적인 사례
 *    1) 이벤트 처리
 *      - 일반적으로 코드는 위에서 아래로 실행을 한다.
 *      - 그러나 특정 사건(마우스 클릭, 텍스트 입력 등)이 발생했을 때
 *        일반적인 코드 흐름을 거슬러서 특정 위치의 메서드를 호출하는 행위.
 *    2) 의존 객체 주입
 *      - 일반적으로는 자신이 사용할 객체는 직접 만들어서 쓴다.
 *      - 그러나 메모리 관리를 효율적으로 하기 위해 외부에서 의존 객체를 주입하는 행위.
 *      - 이점:
 *        (1) 의존 객체를 다른 객체로 대체하기 쉽다.
 *        (2) 단위 테스트가 쉬워진다.
 *            객체를 테스트하는데 의존 객체가 필요하다면,
 *            또 그 의존 객체를 만드는데 시간을 허비할 수 있다.
 *            이 때 목업(mockup; 가짜) 의존 객체를 간단히 만들어 주입하고,
 *            실제 테스트하려는 객체를 빠르게 점검할 수 있다. 
 *     
 */
package step25.ex1;

public class Test {

  public static void main(String[] args) {
    Car c = new Car("비트비트", 5, "비트자동차");
    c.run();
  }

}
