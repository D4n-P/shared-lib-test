def call(Map config = [:]) {
    sh "echo Hi, my name is ${config.name}. today is ${config.day}"
}
