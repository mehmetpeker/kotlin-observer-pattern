class SecondListener:ValueChallengeListener {
    override fun valueChanged(text: String) {
        println("Second Listener - Value changed to $text")
    }
}