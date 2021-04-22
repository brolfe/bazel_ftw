load("@rules_java//java:defs.bzl", "java_test", "java_library")

java_test(
  name = "solution",
  srcs = ["SolutionTest.java"],
  test_class = "abc.SolutionTest",
  deps = ["//src/main/java/abc",
    "@maven//:junit_junit",
    "@maven//:com_google_truth_truth",
    "@maven//:org_mockito_mockito_core",
  ]
)

