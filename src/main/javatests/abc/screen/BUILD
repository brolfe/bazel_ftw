load("@rules_java//java:defs.bzl", "java_test", "java_library")

java_test(
  name = "screen_test",
  srcs = ["ScreenSolverTest.java"],
  test_class = "abc.screen.ScreenSolverTest",
  deps = [
    "//src/main/java/abc/screen",
    "@maven//:junit_junit",
    "@maven//:com_google_truth_truth",
    "@maven//:org_mockito_mockito_core",
  ]
)

