package controller;

public @interface RequestParam {
    String name();

    boolean required();

    String defaultValue();
}
