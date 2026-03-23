def call(env) {
  if (params.env=="main") {
    steps.echo "testing in main"
  }
  else if (params.env=="dev") {
    steps.echo "testing in dev"
  }
  else {
    steps.echo "testing in qa"
  }
}
