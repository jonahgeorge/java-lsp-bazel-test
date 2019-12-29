load("@rules_java//java:defs.bzl", "java_binary")
java_binary(
    name = "LspBazelTest",
    main_class = "LspBazelTest",
    srcs = glob(["*.java"]),
    deps = [
        "@maven//:com_google_code_gson_gson",
    ],
)