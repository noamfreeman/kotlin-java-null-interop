import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AJavaImpl implements A {

    @Override
    public void foo(@NotNull String nonNullParam) {
        System.out.println("AImpl expecting param to be not null: " + nonNullParam);
    }

    @Override
    public void bar(@Nullable String nullableParam) {
        System.out.println("AImpl expecting param to be nullable: " + nullableParam);
    }
}
