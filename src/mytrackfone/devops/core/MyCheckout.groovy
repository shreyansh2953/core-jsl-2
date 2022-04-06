package mytrackfone.devops.core


def git_Checkout(git_url,branch,steps)
{
     steps.checkout([$class: 'GitSCM', branches: [[name: "${branch}"]], extensions: [], userRemoteConfigs: [[url: "${git_url}"]]])
}