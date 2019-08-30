class FirstListener :ValueChallengeListener{
    override fun valueChanged(text: String) {
        println("First Listener - Value changed to $text")
    }
}