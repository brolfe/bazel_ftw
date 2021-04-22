load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_library(
  name = "demo",
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
    ":demo",
    "@maven//:com_google_inject_guice",
  ],
)

java_library(
  name = "demo_main_lib",
  srcs = ["DemoMain.java"],
  deps = [
    ":demo",
    ":demo_module",
    "@maven//:com_google_inject_guice",
  ],
)

java_binary(
  name = "demo_main",
  runtime_deps = [
    ":demo_main_lib",
  ],
  main_class = "abc.demo.DemoMain",
)