fun main() {
    println("ex4")

    val a = object : OverrideWithoutNullAnnotations {
        override fun foo(nonNullParam: String?) {
            println("java expect non null: $nonNullParam")
        }
    }

    a.foo(null)
}