fun main() {
    println("ex3")

    @Suppress("ABSTRACT_MEMBER_NOT_IMPLEMENTED")
    val suppresso = object : A {
            @Suppress("NOTHING_TO_OVERRIDE", "ACCIDENTAL_OVERRIDE")
            override fun foo(nonNullParam: String?) {
                println("java expect non null: $nonNullParam")
            }
        }

    suppresso.foo(null)

//    `wait! but what about overriding a kotlin interface?`()
}



















interface K {
    fun foo(nonNull: String)
}

fun `wait! but what about overriding a kotlin interface?`() {
    @Suppress("ABSTRACT_MEMBER_NOT_IMPLEMENTED")
    val kOverride = object : K {
        @Suppress("NOTHING_TO_OVERRIDE", "ACCIDENTAL_OVERRIDE")
        override fun foo(nonNull: String?) {
            println("will this work? $nonNull")
        }

    }

    kOverride.foo(null)
}
