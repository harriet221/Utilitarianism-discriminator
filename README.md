#Utilitarianism-discriminator
##2021-1 융합프로그래밍 1 과제 / 공리주의 판별기

윤리학의 한 분야인 규범윤리학은 윤리와 도덕에 대한 앎을 넘어서 삶의 지침을 제시하는 것을 목표로 한다. 그 대표적인 이론에는 덕윤리와 공리주의, 의무론이 있는데, 공리주의는 벤담이 정립한 결과주의 규범 윤리 이론이다. 벤담의 공리주의는 양적 공리주의로, 그의 이론에 따르면 각 행위의 공리는 대략적으로 수치화하여 그 양을 계산할 수 있다.

 이 공리주의 기계는 강도 지속성 확신성 근접성 생산성 순수성, 이 6가지 항목에 점수를 매겨 당신의 행위가 공리주의적으로 옳은 선택인지 판별해준다. 명시된 순서대로 중요하긴 하지만 그 기준치는 명확하지 않은데, 해당 기계에서 각 항목에 대한 기준치는 임의로 결정되었다. 또한 6가지 항목은 보통 어떤 행위가 더 공리적인가를 판별하는 비교의 기준으로 사용되나, 해당 기계에서는 행위의 공리성을 판별해주는 기준으로 활용되었다.

class Behavior (행위)
int pleasure (쾌락의 양)
int sum (쾌락의 합)
void set_point(int)
int get_point()
void plus_point(int, Utility)
int result(Utility, Utility, Utility, Utility, Utility, Utility)
int result(Utility)

class Utility (유용성)
int point (쾌락 점수)
String category (항목 이름)
int get_point()
void set_principle(String)
boolean plus(int)

 두 클래스는 각각 행위와 유용성을 의미한다. 각 클래스의 객체는 한 행위와 공리주의의 6 기준으로 만들어졌다. 클래스 간 메시지 패싱은 3번 이루어지는데, 첫 번째로 Main에서 act1.plus_point(sc.nextInt(), 유용성 클래스 객체);를 통해 메시지 패싱을 실행하면, 행위 클래스에서 void plus_point(int, Utility)를 통해 객체 인자를 전달받아 boolean plus(int) 메소드를 호출하여 입력된 값을 객체의 point(점수) 변수에 할당해도 되는지 확인하고 10보다 작으면 할당한다. 사용자가 행위에 대해 입력한 항목의 점수를 공리 판별 기계가 입력받아서 각 점수가 해당 항목의 공리 기준에 맞는지 확인한다.
 두 번째로 Main에서 act1.result(유용성 클래스 객체*6);를 통해 메시지 패싱을 실행하면, 행위 클래스에서 void show()와 int get_point()를 호출하여 각 category(항목)+point(점수)를 보여주고 point(점수) 값을 반환받아 연산하여 sum(공리의 총합) 값을 반환해준다. 공리 판별 기계는 각 항목의 점수를 합해 총합이 60점 만점에 40점이라는 기준을 넘는지 보고 행위 전체의 공리(유용성)를 판별해준다.
 세 번째로 Main에서 act1.result(유용성 클래스 객체);를 통해 메시지 패싱을 실행하면, 행위 클래스에서 int get_point()를 호출하여 point(점수) 값을 반환받아 그대로 반환해준다. 이 값을 가지고 항목의 점수가 기준에 미달 여부를 판별한다. 기계는 전체 공리는 기준에 맞았지만 각 항목의 점수가 기준에 미치지 못한다면 어떤 항목이 부족한지 알려준다. 
 공리 판별 기계는 점수의 합이 40과 같거나 크면서 각 항목의 기준치를 만족시킨다면 공리주의적으로 옳은 행위로 판단한다. 사용자는 자신의 선택지의 공리를 판별 받아 행위 선택의 기준 혹은 근거로 사용할 수 있다.
