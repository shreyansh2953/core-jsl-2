package mytrackfone.devops.core

def steps
MyCheckout(steps){
   this.steps = steps
}

def git_Checkout(git_url,branch)
{
     steps.checkout([$class: 'GitSCM', branches: [[name: "${branch}"]], extensions: [], userRemoteConfigs: [[url: "${git_url}"]]])
}