package mytrackfone.devops.plan_apply

def destroy(mytool,var_file,my_region){

    withAWS(credentials: 'my-aws-cred', region: "${my_region}") {
              sh """                  
                 ${mytool}/terraform destroy -var-file=${var_file} -auto-approve"
              """

              
         }

}