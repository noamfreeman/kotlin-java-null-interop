fun main() {
    println("ex6 - delegation")

    val a = object : A {
        override fun foo(nonNullParam: String) {
            println("java expect non null: $nonNullParam")
        }
    }

//    @Suppress("ABSTRACT_MEMBER_NOT_IMPLEMENTED")
//    val delegate = object : A by a {
//        @Suppress("NOTHING_TO_OVERRIDE", "ACCIDENTAL_OVERRIDE")
//        override fun foo(nonNullParam: String?) {
//            println("changing delegate. param: $nonNullParam")
//        }
//    }
//
//    delegate.foo(null)


//     `wait! what about delegeting a java implementation?`()
}









fun `wait! what about delegeting a java implementation?`() {
    val javaDelegate = object : A by AJavaImpl() {}

    // kotlin filled in a kotlin foo() function in the "source code" so
    AJavaWrapper(javaDelegate).foo(null)
}