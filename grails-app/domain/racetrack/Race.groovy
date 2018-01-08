package racetrack

class Race {
    String name
    Date startDate
    String state
    BigDecimal distance
    BigDecimal cost
    Integer maxRunners = 10000

    static constraints = {
    }
}
