load("@rules_java//java:defs.bzl", "java_test", "java_library")

java_test(
  name = "demo",
  srcs = ["DemoTest.java"],
  test_class = "abc.DemoTest",
  deps = [
    "//src/main/java/abc",
    "@maven//:junit_junit",
    "@maven//:com_google_truth_truth",
    "@maven//:org_mockito_mockito_core",
  ]
)

