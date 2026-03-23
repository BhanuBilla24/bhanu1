def call(env) {
  if (params.env=="main") {
    step.echo "testing in main"
  }
  else if (params.env=="dev") {
    step.echo "testing in dev"
  }
  else {
    step.echo "testing in qa"
  }
}
