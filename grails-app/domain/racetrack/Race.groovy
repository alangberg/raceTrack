package racetrack

class Race {
    String name
    Date startDate
    String state
    String city
    BigDecimal distance
    BigDecimal cost
    Integer maxRunners = 10000

    static constraints = {
        name()
        startDate()
        city()
        state()
        distance()
        cost()
        maxRunners()
    }





}
