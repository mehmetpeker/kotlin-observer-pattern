import kotlin.properties.Delegates

class ObservableClass {
    var listeners: MutableList<ValueChallengeListener> = mutableListOf()

    var text: String by Delegates.observable(
        initialValue = "Default Text",
        onChange = {
                property, oldValue, newValue ->
                notify(newValue) }
    )


    fun addListener(listener: ValueChallengeListener) {
        listeners.add(listener)
    }

    fun removeListener(listener: ValueChallengeListener) {
        listeners.remove(listener)
    }

    fun notify(t: String) {
        for (o in listeners)
            o.valueChanged(text)
    }
}