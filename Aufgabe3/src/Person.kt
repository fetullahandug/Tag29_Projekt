class Person{
    var name: String
    var phoneNumber: String?
    var age: Int

    constructor(name: String, age: Int){
        this.name = name
        this.age = age
        this.phoneNumber = null
    }

    constructor(name: String, age: Int, phoneNumber: String){
        this.name = name
        this.phoneNumber = phoneNumber
        this.age = age
    }

    init{
        println("Ein Objekt der Klasse ${this.javaClass.name} wurde erstellt!")
    }

    fun sayHello(){
        println("Hallo an alle!\nIch bin der $name")
    }
}