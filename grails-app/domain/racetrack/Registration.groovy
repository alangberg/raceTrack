package racetrack

class Registration {
    String name
    Date dateOfBirth
    String gender
    String address
    String city
    String state
    String zipcode
    String email
    Date dateCreated //dateCreated is a special name!

    static mapping = {
        sort "startDate"
    }

    static constraints = {
    }
}
