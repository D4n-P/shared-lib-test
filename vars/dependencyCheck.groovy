def call() {
    sh "wget https://github.com/jeremylong/DependencyCheck/releases/download/v7.2.1/dependency-check-7.2.1-release.zip -O dependecy-check.zip"
    unzip zipFile: 'dependency-check.zip', dir: '.'
    sh "dependency-check/bin/dependency-check.sh -s . -f xml"
}