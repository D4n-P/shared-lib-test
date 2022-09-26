def call() {
    sh "echo ===== Setup ====="
    sh "rm -rf dependecy-check || true"
    sh "rm dependency-check* || true"
    sh "wget https://github.com/jeremylong/DependencyCheck/releases/download/v7.2.1/dependency-check-7.2.1-release.zip"
    unzip zipFile: 'dependency-check-7.2.1-release.zip'
    sh "chmod +x dependency-check/bin/dependency-check.sh && dependency-check/bin/dependency-check.sh -s . -f XML"
}
