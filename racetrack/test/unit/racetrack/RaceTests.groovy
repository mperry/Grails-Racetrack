package racetrack



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Race)
class RaceTests {

 
    void testInMiles() {
        def race = new Race(distance:5.0)
        def expected = new BigDecimal("3.107")
        assertTrue(
            "expected: " + expected + " actual: " + race.inMiles(),
            expected.compareTo(race.inMiles()) == 0)
    }
 
}
