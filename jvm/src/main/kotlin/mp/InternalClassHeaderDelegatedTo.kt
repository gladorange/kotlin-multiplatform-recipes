package mp

internal actual class InternalClassHeaderDelegatedTo actual constructor(private val owner: CommonClassDelegatingToInternalClassHeader) {
    actual fun doIt() {
        println("Internal actual class in Java for: $owner")
    }
}
