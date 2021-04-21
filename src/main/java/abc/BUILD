load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_library(
  name = "abc",
  srcs = glob(["*.java"]),
  deps = [
    "@maven//:com_google_guava_guava",
  ],
)

java_binary(
  name = "abc_main",
  runtime_deps = [
    ":abc",
  ],
  main_class = "abc.SolutionMain",
)