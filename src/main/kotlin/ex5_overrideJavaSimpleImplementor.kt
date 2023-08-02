fun main() {
    println("ex5")
    val noOverride = object : SimpleJavaA() {}

//     noOverride.foo(null) // does this compile?

//     AJavaWrapper(noOverride).foo(null) // does this run?

    val withOverride = object : SimpleJavaA() {
        // beware! applying IDE suggestion to remove this redundant message,
        // may change behaviour.
        override fun foo(nonNullParam: String) {
            super.foo(nonNullParam)
        }
    }

//     AJavaWrapper(withOverride).foo(null) // does this run?
}