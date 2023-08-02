import org.jetbrains.annotations.Nullable;

public interface OverrideWithoutNullAnnotations extends A {

    // in super implementation - nonNullParam is annotated @NotNull
    @Override
    public void foo(@Nullable String nonNullParam);
}
