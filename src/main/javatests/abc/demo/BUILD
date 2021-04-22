load("@rules_java//java:defs.bzl", "java_test", "java_library")

java_test(
  name = "demo_test",
  srcs = ["DemoTest.java"],
  test_class = "abc.demo.DemoTest",
  deps = [
    "//src/main/java/abc/demo",
    "@maven//:junit_junit",
    "@maven//:com_google_truth_truth",
    "@maven//:org_mockito_mockito_core",
  ]
)

