package mytrackfone.devops.plan_apply

def outputs(mytool,my_region)
{ 
    def output_json
     withAWS(credentials: 'my-aws-cred', region: "${my_region}") {
            
            output_json = sh encoding: 'UTF-8', returnStdout: true, script: "${mytool}/terraform output -json"
              
         }

         return output_json

}