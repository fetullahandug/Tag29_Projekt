class Hund{
    var name: String
    var rasse: String

    constructor(name: String, rasse: String){
        this.name = name
        this.rasse = rasse
    }

    init{
        println("Ein Hund wurde erstellt!\n")
    }

    fun bellen(){
        println("$name: Wuff, wuff wuff!")
    }
}