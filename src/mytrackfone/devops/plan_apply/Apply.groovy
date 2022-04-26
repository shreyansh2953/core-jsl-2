package mytrackfone.devops.plan_apply


def apply(mytool,var_file,my_region){

    withAWS(credentials: 'my-aws-cred', region: "${my_region}") {
              sh """                  
                 ${mytool}/terraform apply -var-file=${var_file} -auto-approve"
              """

              
         }

}

