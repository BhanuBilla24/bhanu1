def call(env) {
  if (params.env=="main") {
    sh echo "testing in main"
  }
  else if (params.env=="dev") {
    sh echo "testing in dev"
  }
  else {
    sh echo "testing in qa"
  }
}
