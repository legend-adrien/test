pipeline{
agent any
stages{
  stage("check maven version"){
    echo mvn -version
  }

}
}
