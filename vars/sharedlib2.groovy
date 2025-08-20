def gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/Heyyprakhar1/${repo}.git"
}
def build()
{
  sh 'python3'
}
def deployement(jobname,ip){
  sh "scp /var/lib/jenkins/workspace/${jobname}/Hello.py ubuntu@${ip}:/home/ubuntu/new-folder"
}
def testing(jobname){
  sh "python3 /var/lib/jenkins/workspace/${jobname}/Hello.py" 
}
def release(jobname, ip){
 sh "scp /var/lib/jenkins/workspace/${jobname}/Hello.py ubuntu@${ip}:/home/ubuntu/new-folder" 
}
