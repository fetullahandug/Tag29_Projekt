class Computer{
    var on: Boolean

    constructor(state: Boolean){
        this.on = state
    }

    fun pressOnButton(){
        if(!on){
            on = true
            println("On!")
        }
    }

    fun pressOffButton(){
        if(on){
            on = false
            println("Off!")
        }
    }

    fun sentMail(){
        if(on){
            println("\nMail sent!")
        }
    }
}