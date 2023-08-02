fun main() {
    println("ex1")
    val kotlinImpl = object : A {
        override fun foo(nonNullParam: String) {
            println("java expect non null: $nonNullParam")
        }
    }

    kotlinImpl.foo("hi")
    kotlinImpl.bar("there")

//    a.foo(null) // will this compile?

    AJavaWrapper(kotlinImpl).foo(null) // will this run?
}