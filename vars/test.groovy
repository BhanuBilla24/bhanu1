def call(env) {
  if (params.env=="main") {
    step.sh "echo testing in main"
  }
  else if (params.env=="dev") {
    step.sh "echo testing in dev"
  }
  else {
    step.sh "echo testing in qa"
  }
}
