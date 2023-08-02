import org.jetbrains.annotations.Nullable;

public class AJavaWrapper implements A {
    private A a;

    public AJavaWrapper(A a) {
        this.a = a;
    }

    public void foo(@Nullable String param) {
        a.foo(param);
    }

    public void bar(String param) {
        a.bar(param);
    }
}
