class Katze{
    var name: String
    var fell: String

    constructor(name: String, fell: String){
        this.name = name
        this.fell = fell
    }

    init{
        println("Ein Objekt der Klasse ${this.javaClass.name} wurde erstellt!")
    }

    fun miauen(){
        println("Miau!")
    }
}