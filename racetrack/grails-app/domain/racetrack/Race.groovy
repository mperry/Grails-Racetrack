package racetrack


class Race {

    static constraints = {
        name(blank:false, maxSize:50)
        startDate()
        city()
        state(inList:["GA", "NC", "SC", "VA"])
        distance(min:0.0)
        cost(min:0.0, max:100.0)
        maxRunners(min:0, max:100000)
    }
    
    static hasMany = [registrations:Registration]
    
    String name
    Date startDate
    String city
    String state
    BigDecimal distance
    BigDecimal cost
    Integer maxRunners

    BigDecimal inMiles(){
        return distance * 0.6214
    }

	
}