load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_library(
  name = "abc",
  srcs = glob(["*.java"], exclude = ["SolutionModule.java", "SolutionMain.java"]),
  deps = [
    "@maven//:com_google_guava_guava",
    "@maven//:com_google_inject_guice",
  ],
)

java_library(
  name = "solution_module",
  srcs = ["SolutionModule.java"],
  deps = [
    ":abc",
    "@maven//:com_google_inject_guice",
  ],
)

java_library(
  name = "solution_main",
  srcs = ["SolutionMain.java"],
  deps = [
    ":abc",
    ":solution_module",
    "@maven//:com_google_inject_guice",
  ],
)

java_binary(
  name = "abc_main",
  runtime_deps = [
    ":solution_main",
  ],
  main_class = "abc.SolutionMain",
)