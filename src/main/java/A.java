import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface A {
    void foo(@NotNull String nonNullParam);

    default void bar(@Nullable String nullableParam) {
        System.out.println("default bar. param is " + nullableParam);
    }
}