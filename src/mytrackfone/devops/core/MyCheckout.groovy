package mytrackfone.devops.core


def git_Checkout(git_url,branch)
{
     checkout([$class: 'GitSCM', branches: [[name: "${branch}"]], extensions: [], userRemoteConfigs: [[url: "${git_url}"]]])
}