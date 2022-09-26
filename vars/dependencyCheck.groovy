def call() {
    sh "wget https://github.com/jeremylong/DependencyCheck/releases/download/v7.2.1/dependency-check-7.2.1-release.zip -O /var/lib/jenkins/workspace/insecure-bank/dependecy-check.zip"
    unzip zipFile: 'dependency-check.zip', dir: '/var/lib/jenkins/workspace/insecure-bank/'
    sh "dependency-check/bin/dependency-check.sh -s . -f xml"
}
