load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_library(
  name = "abc",
  srcs = glob(["*.java"], exclude = ["DemoModule.java", "DemoMain.java"]),
  deps = [
    "@maven//:com_google_guava_guava",
    "@maven//:com_google_inject_guice",
  ],
)

java_library(
  name = "demo_module",
  srcs = ["DemoModule.java"],
  deps = [
    ":abc",
    "@maven//:com_google_inject_guice",
  ],
)

java_library(
  name = "demo_main",
  srcs = ["DemoMain.java"],
  deps = [
    ":abc",
    ":demo_module",
    "@maven//:com_google_inject_guice",
  ],
)

java_binary(
  name = "abc_main",
  runtime_deps = [
    ":demo_main",
  ],
  main_class = "abc.DemoMain",
)