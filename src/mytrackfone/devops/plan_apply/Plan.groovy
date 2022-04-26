package mytrackfone.devops.plan_apply


def plan(mytool,var_file,my_region){

    withAWS(credentials: 'my-aws-cred', region: "${my_region}") {
              sh """                  
                 ${mytool}/terraform init
                 ${mytool}/terraform plan -var-file=${var_file} -out=planfile"
              """
         }

}
