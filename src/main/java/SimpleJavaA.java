import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SimpleJavaA implements A {

    @Override
    public void foo(@NotNull String nonNullParam) {
        System.out.println("SimpleJavaA expecting param to be not null: " + nonNullParam);
    }

    @Override
    public void bar(@Nullable String nullableParam) {
        System.out.println("SimpleJavaA expecting param to be nullable: " + nullableParam);
    }
}
