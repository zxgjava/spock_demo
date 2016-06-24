/**
 * Created by zxg on 16/6/24.
 */
import spock.lang.Specification
class SumTest extends Specification {
    def sum = new Sum();
    def "sum should return param1+param2"() {
        expect:
        sum.sum(a,b) == count

        where:
        a   |   b   ||  count
        1   |   1   ||  2
        1   |   2   ||  3
        1   |   3   ||  4
    }
}