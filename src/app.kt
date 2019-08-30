fun main() {
    var firstListener = FirstListener()
    var secondListener = SecondListener()
    var observable = ObservableClass()
    observable.addListener(firstListener)
    observable.addListener(secondListener)
    observable.text = "Hello"
    observable.text = "World"
    observable.removeListener(firstListener)
    observable.text = "Removed First Listener"
}